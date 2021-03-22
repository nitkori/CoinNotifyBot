package net.nitkori.coinnotify.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CoinOneApiClient {
    val api: CoinOneApi

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.upbit.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build()
        api = retrofit.create(CoinOneApi::class.java)
    }
}