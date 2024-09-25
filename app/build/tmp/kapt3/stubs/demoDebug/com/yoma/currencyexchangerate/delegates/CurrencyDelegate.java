package com.yoma.currencyexchangerate.delegates;

import com.yoma.currencyexchangerate.models.CurrencyRateVO;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/yoma/currencyexchangerate/delegates/CurrencyDelegate;", "", "onTapConvert", "", "data", "Lcom/yoma/currencyexchangerate/models/CurrencyRateVO;", "onTapCurrency", "", "app_demoDebug"})
public abstract interface CurrencyDelegate {
    
    public abstract void onTapConvert(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.models.CurrencyRateVO data);
    
    public abstract void onTapCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String data);
}