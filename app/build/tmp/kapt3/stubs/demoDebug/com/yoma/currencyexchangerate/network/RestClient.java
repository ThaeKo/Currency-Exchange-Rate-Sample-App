package com.yoma.currencyexchangerate.network;

import com.google.gson.GsonBuilder;
import com.yoma.currencyexchangerate.BuildConfig;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/yoma/currencyexchangerate/network/RestClient;", "", "()V", "apiServices", "Lcom/yoma/currencyexchangerate/network/ApiServices;", "Companion", "HeaderInterceptor", "app_demoDebug"})
public final class RestClient {
    @org.jetbrains.annotations.NotNull
    private final com.yoma.currencyexchangerate.network.ApiServices apiServices = null;
    @org.jetbrains.annotations.NotNull
    public static final com.yoma.currencyexchangerate.network.RestClient.Companion Companion = null;
    
    public RestClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002\u00a8\u0006\b"}, d2 = {"Lcom/yoma/currencyexchangerate/network/RestClient$Companion;", "", "()V", "getApiData", "Lretrofit2/Retrofit;", "getApiService", "Lcom/yoma/currencyexchangerate/network/ApiServices;", "getRetrofit", "app_demoDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        private final retrofit2.Retrofit getApiData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.yoma.currencyexchangerate.network.ApiServices getApiService() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/yoma/currencyexchangerate/network/RestClient$HeaderInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_demoDebug"})
    public static final class HeaderInterceptor implements okhttp3.Interceptor {
        
        public HeaderInterceptor() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
    }
}