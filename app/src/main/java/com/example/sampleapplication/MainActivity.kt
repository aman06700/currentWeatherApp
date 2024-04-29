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
import com.example.sampleapplication.databinding.ActivityMainBinding
import com.example.sampleapplication.retrofit.ApiInterface
import com.example.sampleapplication.retrofit.RetrofitClient
import com.example.sampleapplication.retrofit.model.ApiResponse
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val fetchWeatherBtn: Button
       get() = findViewById(R.id.fetchWeatherButton)
    val wheatherTv: TextView
        get() = findViewById(R.id.fetchWeatherButton)
    val city: EditText
        get() = findViewById(R.id.cityEt)
    val lat =8.9999
    val lon = 3.58457
   private val weatherViewModel: WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
        }

        binding.apply {
            weatherViewModel.fetchCurrentWeather(29.452257,74.669319,"metric").enqueue(object:
                retrofit2.Callback<ApiResponse> {
                override fun onResponse(
                    call: Call<com.example.sampleapplication.retrofit.model.ApiResponse>,
                    response: Response<com.example.sampleapplication.retrofit.model.ApiResponse>
                ) {
                    Log.e("random text",response.body().toString())
                }

                override fun onFailure(
                    call: Call<com.example.sampleapplication.retrofit.model.ApiResponse>,
                    t: Throwable
                ) {
                    TODO("Not yet implemented")
                }


            })

        }

        binding.wheaterTv.setOnClickListener {


        }
    }
}


