package com.yoma.currencyexchangerate.views;

import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/yoma/currencyexchangerate/views/CurrencyView;", "Lcom/yoma/currencyexchangerate/views/BaseView;", "apiUsageFullState", "", "currencyConvertDataSuccess", "response", "Lcom/yoma/currencyexchangerate/network/response/CurrencyConvertResponse;", "currencyDataSuccess", "Lcom/yoma/currencyexchangerate/network/response/CurrencyResponse;", "app_demoDebug"})
public abstract interface CurrencyView extends com.yoma.currencyexchangerate.views.BaseView {
    
    public abstract void currencyDataSuccess(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.network.response.CurrencyResponse response);
    
    public abstract void currencyConvertDataSuccess(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse response);
    
    public abstract void apiUsageFullState();
}