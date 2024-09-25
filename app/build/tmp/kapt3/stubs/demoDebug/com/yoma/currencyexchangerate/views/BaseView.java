package com.yoma.currencyexchangerate.views;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/yoma/currencyexchangerate/views/BaseView;", "", "showError", "", "message", "", "status", "", "showNetworkFailed", "app_demoDebug"})
public abstract interface BaseView {
    
    public abstract void showError(@org.jetbrains.annotations.NotNull
    java.lang.String message, boolean status);
    
    public abstract void showNetworkFailed();
}