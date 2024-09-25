package com.yoma.currencyexchangerate.network;

import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/yoma/currencyexchangerate/network/ApiServices;", "", "currencyConvert", "Lretrofit2/Call;", "Lcom/yoma/currencyexchangerate/network/response/CurrencyConvertResponse;", "access_key", "", "from", "to", "amount", "", "getCurrency", "Lcom/yoma/currencyexchangerate/network/response/CurrencyResponse;", "source", "app_demoDebug"})
public abstract interface ApiServices {
    
    @retrofit2.http.GET(value = "live")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.yoma.currencyexchangerate.network.response.CurrencyResponse> getCurrency(@retrofit2.http.Query(value = "access_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String access_key, @retrofit2.http.Query(value = "source")
    @org.jetbrains.annotations.NotNull
    java.lang.String source);
    
    @retrofit2.http.GET(value = "convert")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse> currencyConvert(@retrofit2.http.Query(value = "access_key")
    @org.jetbrains.annotations.NotNull
    java.lang.String access_key, @retrofit2.http.Query(value = "from")
    @org.jetbrains.annotations.NotNull
    java.lang.String from, @retrofit2.http.Query(value = "to")
    @org.jetbrains.annotations.NotNull
    java.lang.String to, @retrofit2.http.Query(value = "amount")
    float amount);
}