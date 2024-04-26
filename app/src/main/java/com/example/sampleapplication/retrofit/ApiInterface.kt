package com.example.sampleapplication.retrofit

import com.example.sampleapplication.retrofit.model.ApiResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiInterface {
    @GET("data/2.5/weather ")
    fun getWeatherResponse(
        @Field("lat") lat: Double,
        @Field("lon") long: Double?,
        @Field("units") units: String?,
        @Field("appId") appId: String?
    ): Call<ApiResponse?>?

}