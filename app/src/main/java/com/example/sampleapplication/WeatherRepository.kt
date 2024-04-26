package com.example.sampleapplication

import com.example.sampleapplication.retrofit.ApiInterface

class WeatherRepository( val apiService: ApiInterface) {
    fun getWeather(lat: Double,lon : Double,unit:String){
        apiService.getWeatherResponse(lat,lon,unit,"ec10364b2d5834051ab10bc7c284c333")
    }
}