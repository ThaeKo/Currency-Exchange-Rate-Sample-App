package com.yoma.currencyexchangerate.network.base

import com.google.gson.annotations.SerializedName

open class BaseResponse{

    @SerializedName("success")
    var success: Boolean = true

    @SerializedName("source")
    var source: String? = ""

    @SerializedName("error")
    val error: BaseError ?= null

}