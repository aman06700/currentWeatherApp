package com.example.sampleapplication

import androidx.lifecycle.ViewModel
import com.example.sampleapplication.retrofit.ApiInterface
import com.example.sampleapplication.retrofit.RetrofitClient
import com.example.sampleapplication.retrofit.model.ApiResponse
import com.example.sampleapplication.retrofit.model.Response
import retrofit2.Call

class WeatherViewModel(val weatherRepository: WeatherRepository) : ViewModel() {
    constructor():this(WeatherRepository(RetrofitClient().getClient().create(ApiInterface::class.java)))

    fun fetchCurrentWeather(lat:Double,lon:Double,unit:String): Call<ApiResponse> {
       return weatherRepository.getWeather(lat,lon,unit)
    }


}