package com.yoma.currencyexchangerate.network.base

import com.google.gson.annotations.SerializedName

open class BaseObjectResponse<T> : BaseResponse() {
    @SerializedName("quotes")
    val quotes: T? = null
}