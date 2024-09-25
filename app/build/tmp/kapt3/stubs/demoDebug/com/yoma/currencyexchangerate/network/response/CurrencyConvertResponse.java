package com.yoma.currencyexchangerate.network.response;

import com.yoma.currencyexchangerate.models.InfoVO;
import com.yoma.currencyexchangerate.models.QueryVO;
import com.yoma.currencyexchangerate.network.base.BaseResponse;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/yoma/currencyexchangerate/network/response/CurrencyConvertResponse;", "Lcom/yoma/currencyexchangerate/network/base/BaseResponse;", "()V", "info", "Lcom/yoma/currencyexchangerate/models/InfoVO;", "getInfo", "()Lcom/yoma/currencyexchangerate/models/InfoVO;", "setInfo", "(Lcom/yoma/currencyexchangerate/models/InfoVO;)V", "query", "Lcom/yoma/currencyexchangerate/models/QueryVO;", "getQuery", "()Lcom/yoma/currencyexchangerate/models/QueryVO;", "result", "", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "app_demoDebug"})
public final class CurrencyConvertResponse extends com.yoma.currencyexchangerate.network.base.BaseResponse {
    @org.jetbrains.annotations.Nullable
    private final com.yoma.currencyexchangerate.models.QueryVO query = null;
    @org.jetbrains.annotations.Nullable
    private com.yoma.currencyexchangerate.models.InfoVO info;
    @org.jetbrains.annotations.Nullable
    private java.lang.String result = "";
    
    public CurrencyConvertResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.yoma.currencyexchangerate.models.QueryVO getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.yoma.currencyexchangerate.models.InfoVO getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.Nullable
    com.yoma.currencyexchangerate.models.InfoVO p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}