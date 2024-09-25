package com.yoma.currencyexchangerate.network.response

import com.yoma.currencyexchangerate.network.base.BaseResponse

class CurrencyResponse : BaseResponse() {
    val quotes: MutableMap<String, Float>? = null
}