package com.yoma.currencyexchangerate.network.base;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/yoma/currencyexchangerate/network/base/BaseResponse;", "", "()V", "error", "Lcom/yoma/currencyexchangerate/network/base/BaseError;", "getError", "()Lcom/yoma/currencyexchangerate/network/base/BaseError;", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "success", "", "getSuccess", "()Z", "setSuccess", "(Z)V", "app_demoDebug"})
public class BaseResponse {
    @com.google.gson.annotations.SerializedName(value = "success")
    private boolean success = true;
    @com.google.gson.annotations.SerializedName(value = "source")
    @org.jetbrains.annotations.Nullable
    private java.lang.String source = "";
    @com.google.gson.annotations.SerializedName(value = "error")
    @org.jetbrains.annotations.Nullable
    private final com.yoma.currencyexchangerate.network.base.BaseError error = null;
    
    public BaseResponse() {
        super();
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSource() {
        return null;
    }
    
    public final void setSource(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.yoma.currencyexchangerate.network.base.BaseError getError() {
        return null;
    }
}