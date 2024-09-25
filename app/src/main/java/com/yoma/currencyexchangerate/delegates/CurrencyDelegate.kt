package com.yoma.currencyexchangerate.delegates

import com.yoma.currencyexchangerate.models.CurrencyRateVO

interface CurrencyDelegate {

    fun onTapConvert(data : CurrencyRateVO)

    fun onTapCurrency(data : String)

}