package com.yoma.currencyexchangerate.activities

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.yoma.currencyexchangerate.R
import com.yoma.currencyexchangerate.adapters.CurrencyRateAdapter
import com.yoma.currencyexchangerate.databinding.ActivityMainBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate
import com.yoma.currencyexchangerate.localdb.CurrencyTable
import com.yoma.currencyexchangerate.localdb.ExchangeRateTable
import com.yoma.currencyexchangerate.models.CurrencyListVO
import com.yoma.currencyexchangerate.models.CurrencyRateListVO
import com.yoma.currencyexchangerate.models.CurrencyRateVO
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse
import com.yoma.currencyexchangerate.network.response.CurrencyResponse
import com.yoma.currencyexchangerate.utils.Constants
import com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel
import com.yoma.currencyexchangerate.views.CurrencyView

class MainActivity : BaseActivity(),CurrencyView,CurrencyDelegate {

    lateinit var binding : ActivityMainBinding
    lateinit var mViewModel : CurrencyViewModel
    lateinit var mAdapter : CurrencyRateAdapter
    private var mCurrencyRateList : MutableList<CurrencyRateVO> = mutableListOf()
    private var dataExit : Boolean = false
    private var currentRateVO : CurrencyRateVO ?= null
    private var requestAmount : Float = 0.0f
    private var updateDbId : Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewModel()
        initLayout()
        onClickEvent()
    }

    private fun initViewModel(){
        mViewModel = ViewModelProvider(this)[CurrencyViewModel::class.java]
        mViewModel.setView(this)
    }

    private fun initLayout() {
        mAdapter = CurrencyRateAdapter(this)
        binding.rvRate.apply {
            setHasFixedSize(true)
            adapter = mAdapter
        }
    }

    private fun onClickEvent(){
        binding.apply {
            btnSelect.setOnClickListener {
                resultForCurrency.launch(CurrencyActivity.newIntent(this@MainActivity))
            }
        }
    }

    override fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        binding.pbLoading.visibility = View.GONE
    }

    override fun onTapConvert(data: CurrencyRateVO) {
        currentRateVO = data
        binding.apply {
            if(checkInputData()){
                getConvertCurrencyRate(binding.edtCurrencyAmount.text.toString().toFloat())
            }else{
                getConvertCurrencyRate(1.0f)
            }
        }
    }

    override fun onTapCurrency(data: String) {

    }

    override fun currencyDataSuccess(response: CurrencyResponse) {
        hideLoading()
        response.quotes?.let {
            if(it.isNotEmpty()) {
                for ((key, value) in it) {
                    var mKey = key
                    if(key.contains(response.source.toString())){
                        mKey = key.replace(response.source.toString(),"")
                    }
                    mCurrencyRateList.add(CurrencyRateVO(mKey,value))
                }

                currencyDAO?.let {dao->
                    if(dataExit){
                        dao.updateCurrencyExchangeRate(
                            ExchangeRateTable(
                                updateDbId,
                                response.source.toString(),
                                Gson().toJson(CurrencyRateListVO(mCurrencyRateList)),
                                System.currentTimeMillis()
                            )
                        )
                    }else {
                        dao.insertCurrencyExchangeRate(
                            ExchangeRateTable(
                                0,
                                response.source.toString(),
                                Gson().toJson(CurrencyRateListVO(mCurrencyRateList)),
                                System.currentTimeMillis()
                            )
                        )
                    }
                    mAdapter.setNewData(mCurrencyRateList)
                }
            }
        }
    }

    override fun currencyConvertDataSuccess(response: CurrencyConvertResponse) {
        hideLoading()
        showToastMsg("Result is ${response.result}")
    }

    override fun apiUsageFullState() {
        binding.apply {
            currentRateVO?.let {
                var result = requestAmount * it.rate
                showToastMsg("Result is $result")
            }
        }
    }

    override fun showError(message: String, status: Boolean) {
        hideLoading()
        showToastMsg(message)
    }

    override fun showNetworkFailed() {
        showToastMsg(Constants.CONNECTION_FAIL)
    }

    private val resultForCurrency =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            val resultCode = result.resultCode
            val data = result.data
            when (resultCode) {
                Activity.RESULT_OK -> {
                    data?.let {
                        if(it.hasExtra(Constants.DATA_CARRY_CURRENCY)){
                            var currencyKey = it.getStringExtra(Constants.DATA_CARRY_CURRENCY) ?: ""
                            if(currencyKey != ""){
                                binding.tvCurrencyName.text = currencyKey
                                checkLocalDatabase(currencyKey)
                            }
                        }
                    }

                }
            }

        }

    fun checkLocalDatabase(code : String){
        currencyDAO?.let {
            var mData = it.getExchangeRate(code)
            if(mData != null){
                updateDbId = mData.id
                if(differentTimeCalculationFor30Minute(mData.created_time)){
                    dataExit = true
                    getCurrencyRateData()
                }else{
                    var stringFromGson = Gson().fromJson(mData.exchange_rate,CurrencyRateListVO::class.java)
                    mAdapter.setNewData(stringFromGson.currencyRateList)
                }
            }else{
                dataExit = false
                getCurrencyRateData()
            }
        }
    }

    private fun getCurrencyRateData(){
        showLoading()
        mViewModel.getCurrency(binding.tvCurrencyName.text.toString())
    }

    private fun getConvertCurrencyRate(amount : Float){
        showLoading()
        requestAmount = amount
        currentRateVO?.let {
            mViewModel.currencyConvert(
                binding.tvCurrencyName.text.toString(),
                it.name,
                amount
                )
        }
    }

    private fun checkInputData() : Boolean{
        return binding.edtCurrencyAmount.text.toString().isNotEmpty()
    }

}