package com.yoma.currencyexchangerate.network

import com.google.gson.GsonBuilder
import com.yoma.currencyexchangerate.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestClient {
    private val apiServices: ApiServices

    init {

        val okHttpClient = OkHttpClient.Builder()
            .readTimeout(40, TimeUnit.SECONDS)
            .connectTimeout(40, TimeUnit.SECONDS)
//        if (BuildConfig.DEBUG) {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        okHttpClient.addInterceptor(logging)
//        }
        okHttpClient.interceptors().add(Interceptor { chain ->
            val original = chain.request()

            val request = original.newBuilder()
                .header("Accept", "application/json")
                .build()

            chain.proceed(request)
        })

        val gson = GsonBuilder()
            .setLenient()
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_ENDPOINT)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient.build())
            .build()

        apiServices = retrofit.create(ApiServices::class.java)

    }

    companion object {

        private fun getRetrofit(): Retrofit {

            val okHttpClient = OkHttpClient.Builder()
                .readTimeout(40, TimeUnit.SECONDS)
                .connectTimeout(40, TimeUnit.SECONDS)
            okHttpClient.addInterceptor(HeaderInterceptor())

//            if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            okHttpClient.addInterceptor(logging)
//            }

            return Retrofit.Builder()
                .addConverterFactory(
                    GsonConverterFactory.create()
                )
                .client(okHttpClient.build())
                .baseUrl(BuildConfig.SERVER_ENDPOINT)
                .build()
        }

        private fun getApiData(): Retrofit {
            return getRetrofit()
        }

        fun getApiService(): ApiServices {
            val retrofitCall = getApiData()
            return retrofitCall.create(ApiServices::class.java)
        }

    }

    class HeaderInterceptor : Interceptor {

        override fun intercept(chain: Interceptor.Chain): Response = chain.run {
            proceed(
                request()
                    .newBuilder()
//                    .addHeader("timezoneId", TimeZone.getDefault().id.toString())
                    .build()
            )
        }
    }

}