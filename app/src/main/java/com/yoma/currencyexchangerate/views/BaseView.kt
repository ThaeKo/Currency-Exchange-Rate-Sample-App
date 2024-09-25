package com.yoma.currencyexchangerate.views

interface BaseView {
    fun showError(message:String,status : Boolean)
    fun showNetworkFailed()
}