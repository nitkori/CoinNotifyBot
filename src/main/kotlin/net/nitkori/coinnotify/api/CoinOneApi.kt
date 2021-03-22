package net.nitkori.coinnotify.api

import io.reactivex.rxjava3.core.Single
import net.nitkori.coinnotify.response.CoinOneResponse
import retrofit2.http.GET

interface CoinOneApi {
    @GET("ticker?markets=KRW-MBL")
    fun showList(): Single<List<CoinOneResponse>>
}