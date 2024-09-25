package com.yoma.currencyexchangerate.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/yoma/currencyexchangerate/utils/Constants;", "", "()V", "API_FAILED_CODE", "", "API_FAIL_MESSAGE", "", "API_FULL_USAGE_CODE", "API_SUCCESS_CODE", "CONNECTION_FAIL", "DATA_CARRY_CURRENCY", "SOURCE_USD", "app_demoDebug"})
public final class Constants {
    public static final boolean API_SUCCESS_CODE = true;
    public static final boolean API_FAILED_CODE = false;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_FULL_USAGE_CODE = "104";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CONNECTION_FAIL = "Please Check You Internet Connection";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_FAIL_MESSAGE = "Couldn\'t get data!";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATA_CARRY_CURRENCY = "data-carry_currency-key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SOURCE_USD = "USD";
    @org.jetbrains.annotations.NotNull
    public static final com.yoma.currencyexchangerate.utils.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}