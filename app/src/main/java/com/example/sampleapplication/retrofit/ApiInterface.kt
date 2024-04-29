package com.example.sampleapplication.retrofit

import com.example.sampleapplication.retrofit.model.ApiResponse
import com.example.sampleapplication.retrofit.model.Response
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterface {
    @GET("data/2.5/weather ")
    fun getWeatherResponse(
        @Query("lat") lat: Double,
        @Query("lon") long: Double?,
        @Query("units") units: String?,
        @Query("appId") appId: String?
    ): Call<ApiResponse>

}