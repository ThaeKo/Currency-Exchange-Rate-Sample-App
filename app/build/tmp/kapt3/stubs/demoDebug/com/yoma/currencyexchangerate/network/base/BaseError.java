package com.yoma.currencyexchangerate.network.base;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/yoma/currencyexchangerate/network/base/BaseError;", "Ljava/io/Serializable;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "info", "getInfo", "setInfo", "app_demoDebug"})
public final class BaseError implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "code")
    @org.jetbrains.annotations.Nullable
    private java.lang.String code;
    @com.google.gson.annotations.SerializedName(value = "info")
    @org.jetbrains.annotations.Nullable
    private java.lang.String info;
    
    public BaseError() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}