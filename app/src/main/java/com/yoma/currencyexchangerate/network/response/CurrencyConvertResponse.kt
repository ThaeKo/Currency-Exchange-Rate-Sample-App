package com.yoma.currencyexchangerate.network.response

import com.yoma.currencyexchangerate.models.InfoVO
import com.yoma.currencyexchangerate.models.QueryVO
import com.yoma.currencyexchangerate.network.base.BaseResponse

class CurrencyConvertResponse : BaseResponse() {
    val query: QueryVO? = null
    var info : InfoVO ?= null
    var result : String ?= ""
}