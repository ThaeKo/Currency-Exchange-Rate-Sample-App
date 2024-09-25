package com.yoma.currencyexchangerate.network.base

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BaseError : Serializable {
    @SerializedName("code")
    var code: String? = null

    @SerializedName("info")
    var info: String? = null
}