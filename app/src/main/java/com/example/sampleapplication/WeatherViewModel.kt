package com.example.sampleapplication

import androidx.lifecycle.ViewModel
import com.example.sampleapplication.retrofit.ApiInterface

class WeatherViewModel(val weatherRepository: WeatherRepository) : ViewModel()  {
    constructor():this(WeatherRepository(com.example.sampleapplication.retrofit.RetrofitClient().getInstance().create(ApiInterface::class.java)))

    fun  fetchCurrentWeather(lat:Double,lon:Double,unit:String)=
        weatherRepository.getWeather(lat,lon,unit)

}