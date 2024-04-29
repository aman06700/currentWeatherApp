package com.example.sampleapplication

import com.example.sampleapplication.retrofit.ApiInterface
import com.example.sampleapplication.retrofit.model.ApiResponse
import com.example.sampleapplication.retrofit.model.Response
import retrofit2.Call

class WeatherRepository( val apiService: ApiInterface) {
    fun getWeather(lat: Double,lon : Double,unit:String): Call<ApiResponse> {
      return  apiService.getWeatherResponse(lat,lon,unit,"ec10364b2d5834051ab10bc7c284c333")
    }
}