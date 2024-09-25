package com.yoma.currencyexchangerate.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.Gson;
import com.yoma.currencyexchangerate.localdb.CurrencyDao;
import com.yoma.currencyexchangerate.localdb.CurrencyDatabase;
import com.yoma.currencyexchangerate.models.CurrencyListVO;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH&J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/yoma/currencyexchangerate/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currencyDAO", "Lcom/yoma/currencyexchangerate/localdb/CurrencyDao;", "getCurrencyDAO", "()Lcom/yoma/currencyexchangerate/localdb/CurrencyDao;", "setCurrencyDAO", "(Lcom/yoma/currencyexchangerate/localdb/CurrencyDao;)V", "differentTimeCalculationFor30Minute", "", "createTime", "", "hideLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "showToastMsg", "msg", "", "app_demoDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private com.yoma.currencyexchangerate.localdb.CurrencyDao currencyDAO;
    
    public BaseActivity() {
        super();
    }
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
    
    @org.jetbrains.annotations.Nullable
    public final com.yoma.currencyexchangerate.localdb.CurrencyDao getCurrencyDAO() {
        return null;
    }
    
    public final void setCurrencyDAO(@org.jetbrains.annotations.Nullable
    com.yoma.currencyexchangerate.localdb.CurrencyDao p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean differentTimeCalculationFor30Minute(long createTime) {
        return false;
    }
    
    public final void showToastMsg(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
}