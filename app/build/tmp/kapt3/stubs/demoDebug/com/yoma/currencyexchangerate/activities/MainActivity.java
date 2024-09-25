package com.yoma.currencyexchangerate.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.yoma.currencyexchangerate.R;
import com.yoma.currencyexchangerate.adapters.CurrencyRateAdapter;
import com.yoma.currencyexchangerate.databinding.ActivityMainBinding;
import com.yoma.currencyexchangerate.delegates.CurrencyDelegate;
import com.yoma.currencyexchangerate.localdb.CurrencyTable;
import com.yoma.currencyexchangerate.localdb.ExchangeRateTable;
import com.yoma.currencyexchangerate.models.CurrencyListVO;
import com.yoma.currencyexchangerate.models.CurrencyRateListVO;
import com.yoma.currencyexchangerate.models.CurrencyRateVO;
import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse;
import com.yoma.currencyexchangerate.network.response.CurrencyResponse;
import com.yoma.currencyexchangerate.utils.Constants;
import com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel;
import com.yoma.currencyexchangerate.views.CurrencyView;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000eH\u0002J\u000e\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010+\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020%H\u0002J\b\u00102\u001a\u00020%H\u0016J\b\u00103\u001a\u00020%H\u0002J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0002J\u0012\u00106\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\fH\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u0010:\u001a\u00020)H\u0016J\u0018\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u000eH\u0016J\b\u0010?\u001a\u00020%H\u0016J\b\u0010@\u001a\u00020%H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/yoma/currencyexchangerate/activities/MainActivity;", "Lcom/yoma/currencyexchangerate/activities/BaseActivity;", "Lcom/yoma/currencyexchangerate/views/CurrencyView;", "Lcom/yoma/currencyexchangerate/delegates/CurrencyDelegate;", "()V", "binding", "Lcom/yoma/currencyexchangerate/databinding/ActivityMainBinding;", "getBinding", "()Lcom/yoma/currencyexchangerate/databinding/ActivityMainBinding;", "setBinding", "(Lcom/yoma/currencyexchangerate/databinding/ActivityMainBinding;)V", "currentRateVO", "Lcom/yoma/currencyexchangerate/models/CurrencyRateVO;", "dataExit", "", "mAdapter", "Lcom/yoma/currencyexchangerate/adapters/CurrencyRateAdapter;", "getMAdapter", "()Lcom/yoma/currencyexchangerate/adapters/CurrencyRateAdapter;", "setMAdapter", "(Lcom/yoma/currencyexchangerate/adapters/CurrencyRateAdapter;)V", "mCurrencyRateList", "", "mViewModel", "Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;", "getMViewModel", "()Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;", "setMViewModel", "(Lcom/yoma/currencyexchangerate/viewmodels/CurrencyViewModel;)V", "requestAmount", "", "resultForCurrency", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "updateDbId", "", "apiUsageFullState", "", "checkInputData", "checkLocalDatabase", "code", "", "currencyConvertDataSuccess", "response", "Lcom/yoma/currencyexchangerate/network/response/CurrencyConvertResponse;", "currencyDataSuccess", "Lcom/yoma/currencyexchangerate/network/response/CurrencyResponse;", "getConvertCurrencyRate", "amount", "getCurrencyRateData", "hideLoading", "initLayout", "initViewModel", "onClickEvent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTapConvert", "data", "onTapCurrency", "showError", "message", "status", "showLoading", "showNetworkFailed", "app_demoDebug"})
public final class MainActivity extends com.yoma.currencyexchangerate.activities.BaseActivity implements com.yoma.currencyexchangerate.views.CurrencyView, com.yoma.currencyexchangerate.delegates.CurrencyDelegate {
    public com.yoma.currencyexchangerate.databinding.ActivityMainBinding binding;
    public com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel mViewModel;
    public com.yoma.currencyexchangerate.adapters.CurrencyRateAdapter mAdapter;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.yoma.currencyexchangerate.models.CurrencyRateVO> mCurrencyRateList;
    private boolean dataExit = false;
    @org.jetbrains.annotations.Nullable
    private com.yoma.currencyexchangerate.models.CurrencyRateVO currentRateVO;
    private float requestAmount = 0.0F;
    private int updateDbId = -1;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultForCurrency = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.viewmodels.CurrencyViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.yoma.currencyexchangerate.adapters.CurrencyRateAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull
    com.yoma.currencyexchangerate.adapters.CurrencyRateAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    private final void initLayout() {
    }
    
    private final void onClickEvent() {
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
    
    public final void checkLocalDatabase(@org.jetbrains.annotations.NotNull
    java.lang.String code) {
    }
    
    private final void getCurrencyRateData() {
    }
    
    private final void getConvertCurrencyRate(float amount) {
    }
    
    private final boolean checkInputData() {
        return false;
    }
}