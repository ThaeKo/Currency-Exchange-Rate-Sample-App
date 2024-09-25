package com.yoma.currencyexchangerate.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.yoma.currencyexchangerate.adapters.CurrencyAdapter
import com.yoma.currencyexchangerate.databinding.ActivityCurrencyBinding
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate
import com.yoma.currencyexchangerate.localdb.CurrencyTable
import com.yoma.currencyexchangerate.models.CurrencyListVO
import com.yoma.currencyexchangerate.models.CurrencyRateVO
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse
import com.yoma.currencyexchangerate.network.response.CurrencyResponse
import com.yoma.currencyexchangerate.utils.Constants
import com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel
import com.yoma.currencyexchangerate.views.CurrencyView

class CurrencyActivity : BaseActivity(),CurrencyView,CurrencyDelegate {

    lateinit var binding : ActivityCurrencyBinding
    lateinit var mAdapter : CurrencyAdapter
    private var mCurrencyList : MutableList<String> = mutableListOf()
    lateinit var mViewModel : CurrencyViewModel
    private var dataExit : Boolean = false
    var updateDbId : Int = -1

    companion object{
        fun newIntent(mContext : Context) : Intent{
            return Intent(mContext,CurrencyActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrencyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewModel()
        initToolbar()
        initLayout()
        checkCurrencyData()
    }

    private fun initViewModel(){
        mViewModel = ViewModelProvider(this)[CurrencyViewModel::class.java]
        mViewModel.setView(this)
    }

    private fun initToolbar(){
        binding.tlbCurrency.setNavigationOnClickListener { finish() }
    }

    private fun initLayout(){
        mAdapter = CurrencyAdapter(this)
        binding.apply {
            rvCurrency.apply {
                setHasFixedSize(true)
                adapter = mAdapter
            }
        }
    }

    private fun checkCurrencyData() {
        currencyDAO?.let {
            var firstIndexData = it.getCurrencyTable()
            if(firstIndexData != null){
                updateDbId = firstIndexData.id
                if(differentTimeCalculationFor30Minute(firstIndexData.created_time)){
                    dataExit = true
                    getCurrencyData()
                }else{
                    var stringFromGson = Gson().fromJson(firstIndexData.currency_name,CurrencyListVO::class.java)
                    mAdapter.setNewData(stringFromGson.currencyList)
                }
            }else{
                dataExit = false
                getCurrencyData()
            }
        }
    }

    private fun getCurrencyData(){
        showLoading()
        mViewModel.getCurrency(Constants.SOURCE_USD)
    }

    override fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        binding.pbLoading.visibility = View.GONE
    }

    override fun onTapConvert(data: CurrencyRateVO) {

    }

    override fun onTapCurrency(data: String) {
        var mIntent = intent
        mIntent.putExtra(Constants.DATA_CARRY_CURRENCY, data)
        setResult(Activity.RESULT_OK, mIntent)
        finish()
    }

    override fun currencyDataSuccess(response: CurrencyResponse) {
        hideLoading()
        response.quotes?.let {
            if(it.isNotEmpty()) {
                mCurrencyList.add(Constants.SOURCE_USD)
                for ((key, value) in it) {
                    var mKey = key
                    if(key.contains(Constants.SOURCE_USD)){
                        mKey = key.replace(Constants.SOURCE_USD,"")
                    }
                    mCurrencyList.add(mKey)
                }

                currencyDAO?.let {dao->
                    if(dataExit){
                        dao.updateCurrency(
                            CurrencyTable(
                                updateDbId,
                                Gson().toJson(CurrencyListVO(mCurrencyList)),
                                System.currentTimeMillis()
                            )
                        )
                    }else {
                        dao.insertCurrency(
                            CurrencyTable(
                                0,
                                Gson().toJson(CurrencyListVO(mCurrencyList)),
                                System.currentTimeMillis()
                            )
                        )
                    }
                    mAdapter.setNewData(mCurrencyList)
                }
            }
        }
    }

    override fun currencyConvertDataSuccess(response: CurrencyConvertResponse) {

    }

    override fun apiUsageFullState() {

    }

    override fun showError(message: String, status: Boolean) {

    }

    override fun showNetworkFailed() {

    }
}