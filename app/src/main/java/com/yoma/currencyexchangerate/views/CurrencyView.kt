package com.yoma.currencyexchangerate.views

import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse
import com.yoma.currencyexchangerate.network.response.CurrencyResponse


interface CurrencyView : BaseView {
    fun currencyDataSuccess(response: CurrencyResponse)

    fun currencyConvertDataSuccess(response : CurrencyConvertResponse)

    fun apiUsageFullState()
}