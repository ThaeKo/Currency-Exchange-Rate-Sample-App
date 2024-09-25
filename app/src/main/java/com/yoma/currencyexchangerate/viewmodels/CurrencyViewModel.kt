package com.yoma.currencyexchangerate.viewmodels

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.JsonParseException
import com.google.gson.JsonParser
import com.yoma.currencyexchangerate.BuildConfig
import com.yoma.currencyexchangerate.network.RestClient
import com.yoma.currencyexchangerate.network.base.BaseResponse
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse
import com.yoma.currencyexchangerate.network.response.CurrencyResponse
import com.yoma.currencyexchangerate.utils.Constants
import com.yoma.currencyexchangerate.views.CurrencyView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyViewModel : ViewModel() {

    //Api Call
    lateinit var mView: CurrencyView

    fun setView(mView: CurrencyView) {
        this.mView = mView
    }

    fun getCurrency(source : String){
        RestClient.getApiService().getCurrency(BuildConfig.CURRENCY_API_KEY,source)
            .enqueue(object: Callback<CurrencyResponse>{
                override fun onResponse(call: Call<CurrencyResponse>, response: Response<CurrencyResponse>) {

                    if(response.isSuccessful) {
                        val mResponse = response.body()
                        when (mResponse!!.success) {
                            Constants.API_SUCCESS_CODE -> mView.currencyDataSuccess(mResponse)
                            else -> mView.showError(
                                Constants.API_FAIL_MESSAGE,
                                mResponse.success
                            )
                        }
                    }
                    else {
                        val parser = JsonParser()
                        try {
                            val mJson = parser.parse(response.errorBody()!!.string())
                            val errorResponse = Gson().fromJson(mJson, BaseResponse::class.java)
                            if (errorResponse.error != null) {
                                mView.showError(
                                    errorResponse.error.info.toString(),
                                    Constants.API_FAILED_CODE
                                )
                            } else {
                                mView.showError(
                                    Constants.API_FAIL_MESSAGE,
                                    Constants.API_FAILED_CODE
                                )
                            }

                        } catch (ex: JsonParseException) {
                            mView.showError(ex.message.toString(), Constants.API_FAILED_CODE)
                        }
                    }

                }

                override fun onFailure(call: Call<CurrencyResponse>, t: Throwable) {
                    mView.showNetworkFailed()
                }
            })
    }

    fun currencyConvert(from : String,to : String,amount : Float){
        RestClient.getApiService().currencyConvert(BuildConfig.CURRENCY_API_KEY,from,to,amount)
            .enqueue(object: Callback<CurrencyConvertResponse>{
                override fun onResponse(call: Call<CurrencyConvertResponse>, response: Response<CurrencyConvertResponse>) {

                    if(response.isSuccessful) {
                        val mResponse = response.body()
                        when (mResponse!!.success) {
                            Constants.API_SUCCESS_CODE -> mView.currencyConvertDataSuccess(mResponse)
                            else -> mView.showError(
                                Constants.API_FAIL_MESSAGE,
                                mResponse.success
                            )
                        }
                    }
                    else {
                        val parser = JsonParser()
                        try {
                            val mJson = parser.parse(response.errorBody()!!.string())
                            val errorResponse = Gson().fromJson(mJson, BaseResponse::class.java)
                            if (errorResponse.error != null) {
                                if(errorResponse.error.code == Constants.API_FULL_USAGE_CODE){
                                    mView.apiUsageFullState()
                                }else {
                                    mView.showError(
                                        errorResponse.error.info.toString(),
                                        Constants.API_FAILED_CODE
                                    )
                                }
                            } else {
                                mView.showError(
                                    Constants.API_FAIL_MESSAGE,
                                    Constants.API_FAILED_CODE
                                )
                            }

                        } catch (ex: JsonParseException) {
                            mView.showError(ex.message.toString(), Constants.API_FAILED_CODE)
                        }
                    }

                }

                override fun onFailure(call: Call<CurrencyConvertResponse>, t: Throwable) {
                    mView.showNetworkFailed()
                }
            })
    }

}