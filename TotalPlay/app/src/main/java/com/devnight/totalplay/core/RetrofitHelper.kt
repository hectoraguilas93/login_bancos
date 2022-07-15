package com.devnight.totalplay.core
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://ott.totalplay.com.mx/AppTest0/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}