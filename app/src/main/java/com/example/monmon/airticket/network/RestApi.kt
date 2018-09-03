package com.example.monmon.airticket.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestApi{
    val builder = Retrofit.Builder()
            .baseUrl("https://api.androidhive.info/json/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
    fun <S> createService(serviceClass: Class<S>) : S{
        val retrofit = RestApi.builder.build()
        return retrofit.create(serviceClass)
    }
}