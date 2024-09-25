package com.yoma.currencyexchangerate.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.yoma.currencyexchangerate.adapters.CurrencyAdapter;
import com.yoma.currencyexchangerate.databinding.ActivityCurrencyBinding;
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate;
import com.yoma.currencyexchangerate.localdb.CurrencyTable;
import com.yoma.currencyexchangerate.models.CurrencyListVO;
import com.yoma.currencyexchangerate.models.CurrencyRateVO;
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyResponse;
import com.yoma.currencyexchangerate.utils.Constants;
import com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel;
import com.yoma.currencyexchangerate.views.CurrencyView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0002J\u0012\u0010/\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020#2\u0006\u00103\u001a\u00020\u0015H\u0016J\u0018\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\fH\u0016J\b\u00109\u001a\u00020#H\u0016J\b\u0010:\u001a\u00020#H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006<"}, d2 = {"Lcom/yoma/currencyexchangerate/activities/CurrencyActivity;", "Lcom/yoma/currencyexchangerate/activities/BaseActivity;", "Lcom/yoma/currencyexchangerate/views/CurrencyView;", "Lcom/yoma/currencyexchangerate/delegates/CurrencyDelegate;", "()V", "binding", "Lcom/yoma/currencyexchangerate/databinding/ActivityCurrencyBinding;", "getBinding", "()Lcom/yoma/currencyexchangerate/databinding/ActivityCurrencyBinding;", "setBinding", "(Lcom/yoma/currencyexchangerate/databinding/ActivityCurrencyBinding;)V", "dataExit", "", "mAdapter", "Lcom/yoma/currencyexchangerate/adapters/CurrencyAdapter;", "getMAdapter", "()Lcom/yoma/currencyexchangerate/adapters/CurrencyAdapter;", "setMAdapter", "(Lcom/yoma/currencyexchangerate/adapters/CurrencyAdapter;)V", "mCurrencyList", "", "", "mViewModel", "Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;", "getMViewModel", "()Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;", "setMViewModel", "(Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;)V", "updateDbId", "", "getUpdateDbId", "()I", "setUpdateDbId", "(I)V", "apiUsageFullState", "", "checkCurrencyData", "currencyConvertDataSuccess", "response", "Lcom/yoma/currencyexchangerate/network/response/CurrencyConvertResponse;", "currencyDataSuccess", "Lcom/yoma/currencyexchangerate/network/response/CurrencyResponse;", "getCurrencyData", "hideLoading", "initLayout", "initToolbar", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTapConvert", "data", "Lcom/yoma/currencyexchangerate/models/CurrencyRateVO;", "onTapCurrency", "showError", "message", "status", "showLoading", "showNetworkFailed", "Companion", "app_demoDebug"})
public final class CurrencyActivity extends com.yoma.currencyexchangerate.activities.BaseActivity implements com.yoma.currencyexchangerate.views.CurrencyView, com.yoma.currencyexchangerate.delegates.CurrencyDelegate {
    public com.yoma.currencyexchangerate.databinding.ActivityCurrencyBinding binding;
    public com.yoma.currencyexchangerate.adapters.CurrencyAdapter mAdapter;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> mCurrencyList;
    public com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel mViewModel;
    private boolean dataExit = false;
    private int updateDbId = -1;
    @org.jetbrains.annotations.NotNull
    public static final com.yoma.currencyexchangerate.activities.CurrencyActivity.Companion Companion = null;
    
    public CurrencyActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.databinding.ActivityCurrencyBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.databinding.ActivityCurrencyBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.adapters.CurrencyAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.adapters.CurrencyAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel p0) {
    }
    
    public final int getUpdateDbId() {
        return 0;
    }
    
    public final void setUpdateDbId(int p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    private final void initToolbar() {
    }
    
    private final void initLayout() {
    }
    
    private final void checkCurrencyData() {
    }
    
    private final void getCurrencyData() {
    }
    
    @java.lang.Override
    public void showLoading() {
    }
    
    @java.lang.Override
    public void hideLoading() {
    }
    
    @java.lang.Override
    public void onTapConvert(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.models.CurrencyRateVO data) {
    }
    
    @java.lang.Override
    public void onTapCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String data) {
    }
    
    @java.lang.Override
    public void currencyDataSuccess(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.network.response.CurrencyResponse response) {
    }
    
    @java.lang.Override
    public void currencyConvertDataSuccess(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse response) {
    }
    
    @java.lang.Override
    public void apiUsageFullState() {
    }
    
    @java.lang.Override
    public void showError(@org.jetbrains.annotations.NotNull
    java.lang.String message, boolean status) {
    }
    
    @java.lang.Override
    public void showNetworkFailed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/yoma/currencyexchangerate/activities/CurrencyActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "mContext", "Landroid/content/Context;", "app_demoDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull
        android.content.Context mContext) {
            return null;
        }
    }
}