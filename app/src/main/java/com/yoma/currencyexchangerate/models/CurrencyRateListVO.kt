package com.yoma.currencyexchangerate.models

data class CurrencyRateListVO(
    var currencyRateList : MutableList<CurrencyRateVO> = mutableListOf()
)
