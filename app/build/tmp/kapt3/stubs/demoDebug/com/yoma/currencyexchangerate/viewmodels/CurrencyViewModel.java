package com.yoma.currencyexchangerate.viewmodels;

import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.yoma.currencyexchangerate.BuildConfig;
import com.yoma.currencyexchangerate.network.RestClient;
import com.yoma.currencyexchangerate.network.base.BaseResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyResponse;
import com.yoma.currencyexchangerate.utils.Constants;
import com.yoma.currencyexchangerate.views.CurrencyView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mView", "Lcom/yoma/currencyexchangerate/views/CurrencyView;", "getMView", "()Lcom/yoma/currencyexchangerate/views/CurrencyView;", "setMView", "(Lcom/yoma/currencyexchangerate/views/CurrencyView;)V", "currencyConvert", "", "from", "", "to", "amount", "", "getCurrency", "source", "setView", "app_demoDebug"})
public final class CurrencyViewModel extends androidx.lifecycle.ViewModel {
    public com.yoma.currencyexchangerate.views.CurrencyView mView;
    
    public CurrencyViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.views.CurrencyView getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.views.CurrencyView p0) {
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.views.CurrencyView mView) {
    }
    
    public final void getCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String source) {
    }
    
    public final void currencyConvert(@org.jetbrains.annotations.NotNull
    java.lang.String from, @org.jetbrains.annotations.NotNull
    java.lang.String to, float amount) {
    }
}