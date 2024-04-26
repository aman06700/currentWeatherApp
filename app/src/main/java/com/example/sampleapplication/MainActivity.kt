package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.lifecycle.lifecycleScope
import com.example.sampleapplication.retrofit.ApiInterface
import com.example.sampleapplication.retrofit.RetrofitClient

class MainActivity : AppCompatActivity() {

    val fetchWeatherBtn: Button
       get() = findViewById(R.id.fetchWeatherButton)
    val wheatherTv: TextView
        get() = findViewById(R.id.fetchWeatherButton)
    val city: EditText
        get() = findViewById(R.id.cityEt)
    val lat =8.9999
    val lon = 3.58457
   private var weatherViewModel: WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchWeatherBtn.setOnClickListener {
             weatherViewModel.fetchCurrentWeather(lat,lon,"metric").reportFragment
            /*    var retrofit = RetrofitClient.getInstance()
                var apiInterface = retrofit.create(ApiInterface::class.java)
                lifecycleScope.launchWhenCreated {
                    try {
                        val response = apiInterface.getWeatherResponse(28.459497,77.026634,apiKey)
                        Log.e("api response failed",response.toString())

                      *//*  if (response.isSuccessful()) {
                            Log.e("api response",response.toString())


                        } else {
                            Toast.makeText(
                                this@MainActivity,
                                response.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                        }*//*
                    }catch (Ex:Exception){
                        Log.e("Error",Ex.localizedMessage)
                    }
                }*/


        }
    }
}