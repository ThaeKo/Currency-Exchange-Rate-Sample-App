package com.yoma.currencyexchangerate.network.base;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/yoma/currencyexchangerate/network/base/BaseObjectResponse;", "T", "Lcom/yoma/currencyexchangerate/network/base/BaseResponse;", "()V", "quotes", "getQuotes", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_demoDebug"})
public class BaseObjectResponse<T extends java.lang.Object> extends com.yoma.currencyexchangerate.network.base.BaseResponse {
    @com.google.gson.annotations.SerializedName(value = "quotes")
    @org.jetbrains.annotations.Nullable
    private final T quotes = null;
    
    public BaseObjectResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getQuotes() {
        return null;
    }
}