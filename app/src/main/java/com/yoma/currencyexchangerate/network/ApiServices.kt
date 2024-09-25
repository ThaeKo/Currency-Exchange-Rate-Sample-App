package com.yoma.currencyexchangerate.network

import com.yoma.currencyexchangerate.network.response.CurrencyConvertResponse
import com.yoma.currencyexchangerate.network.response.CurrencyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

//    @POST(EndPoints.LOGIN)
//    fun login(
//        @Body req: LoginRequest
//    ): Call<LoginResponse>

    @GET(EndPoints.CURRENCY)
    fun getCurrency(
        @Query("access_key") access_key : String,
        @Query("source") source : String
    ): Call<CurrencyResponse>

    @GET(EndPoints.CONVERT)
    fun currencyConvert(
        @Query("access_key") access_key : String,
        @Query("from") from : String,
        @Query("to") to : String,
        @Query("amount") amount : Float
    ): Call<CurrencyConvertResponse>

}