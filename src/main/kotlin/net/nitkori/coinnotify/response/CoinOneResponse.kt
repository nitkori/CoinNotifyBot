package net.nitkori.coinnotify.response

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class CoinOneResponse {
    @SerializedName("market")
    @Expose
    private var market: String? = null

    @SerializedName("trade_date")
    @Expose
    private var tradeDate: String? = null

    @SerializedName("trade_time")
    @Expose
    private var tradeTime: String? = null

    @SerializedName("trade_date_kst")
    @Expose
    private var tradeDateKst: String? = null

    @SerializedName("trade_time_kst")
    @Expose
    private var tradeTimeKst: String? = null

    @SerializedName("trade_timestamp")
    @Expose
    private var tradeTimestamp: Long? = null

    @SerializedName("opening_price")
    @Expose
    private var openingPrice: Double? = null

    @SerializedName("high_price")
    @Expose
    private var highPrice: Double? = null

    @SerializedName("low_price")
    @Expose
    private var lowPrice: Double? = null

    @SerializedName("trade_price")
    @Expose
    private var tradePrice: Double? = null

    @SerializedName("prev_closing_price")
    @Expose
    private var prevClosingPrice: Double? = null

    @SerializedName("change")
    @Expose
    private var change: String? = null

    @SerializedName("change_price")
    @Expose
    private var changePrice: Double? = null

    @SerializedName("change_rate")
    @Expose
    private var changeRate: Double? = null

    @SerializedName("signed_change_price")
    @Expose
    private var signedChangePrice: Double? = null

    @SerializedName("signed_change_rate")
    @Expose
    private var signedChangeRate: Double? = null

    @SerializedName("trade_volume")
    @Expose
    private var tradeVolume: Double? = null

    @SerializedName("acc_trade_price")
    @Expose
    private var accTradePrice: Double? = null

    @SerializedName("acc_trade_price_24h")
    @Expose
    private var accTradePrice24h: Double? = null

    @SerializedName("acc_trade_volume")
    @Expose
    private var accTradeVolume: Double? = null

    @SerializedName("acc_trade_volume_24h")
    @Expose
    private var accTradeVolume24h: Double? = null

    @SerializedName("highest_52_week_price")
    @Expose
    private var highest52WeekPrice: Double? = null

    @SerializedName("highest_52_week_date")
    @Expose
    private var highest52WeekDate: String? = null

    @SerializedName("lowest_52_week_price")
    @Expose
    private var lowest52WeekPrice: Double? = null

    @SerializedName("lowest_52_week_date")
    @Expose
    private var lowest52WeekDate: String? = null

    @SerializedName("timestamp")
    @Expose
    private var timestamp: Long? = null

    fun getMarket(): String? {
        return market
    }

    fun setMarket(market: String?) {
        this.market = market
    }

    fun getTradeDate(): String? {
        return tradeDate
    }

    fun setTradeDate(tradeDate: String?) {
        this.tradeDate = tradeDate
    }

    fun getTradeTime(): String? {
        return tradeTime
    }

    fun setTradeTime(tradeTime: String?) {
        this.tradeTime = tradeTime
    }

    fun getTradeDateKst(): String? {
        return tradeDateKst
    }

    fun setTradeDateKst(tradeDateKst: String?) {
        this.tradeDateKst = tradeDateKst
    }

    fun getTradeTimeKst(): String? {
        return tradeTimeKst
    }

    fun setTradeTimeKst(tradeTimeKst: String?) {
        this.tradeTimeKst = tradeTimeKst
    }

    fun getTradeTimestamp(): Long? {
        return tradeTimestamp
    }

    fun setTradeTimestamp(tradeTimestamp: Long?) {
        this.tradeTimestamp = tradeTimestamp
    }

    fun getOpeningPrice(): Double? {
        return openingPrice
    }

    fun setOpeningPrice(openingPrice: Double?) {
        this.openingPrice = openingPrice
    }

    fun getHighPrice(): Double? {
        return highPrice
    }

    fun setHighPrice(highPrice: Double?) {
        this.highPrice = highPrice
    }

    fun getLowPrice(): Double? {
        return lowPrice
    }

    fun setLowPrice(lowPrice: Double?) {
        this.lowPrice = lowPrice
    }

    fun getTradePrice(): Double? {
        return tradePrice
    }

    fun setTradePrice(tradePrice: Double?) {
        this.tradePrice = tradePrice
    }

    fun getPrevClosingPrice(): Double? {
        return prevClosingPrice
    }

    fun setPrevClosingPrice(prevClosingPrice: Double?) {
        this.prevClosingPrice = prevClosingPrice
    }

    fun getChange(): String? {
        return change
    }

    fun setChange(change: String?) {
        this.change = change
    }

    fun getChangePrice(): Double? {
        return changePrice
    }

    fun setChangePrice(changePrice: Double?) {
        this.changePrice = changePrice
    }

    fun getChangeRate(): Double? {
        return changeRate
    }

    fun setChangeRate(changeRate: Double?) {
        this.changeRate = changeRate
    }

    fun getSignedChangePrice(): Double? {
        return signedChangePrice
    }

    fun setSignedChangePrice(signedChangePrice: Double?) {
        this.signedChangePrice = signedChangePrice
    }

    fun getSignedChangeRate(): Double? {
        return signedChangeRate
    }

    fun setSignedChangeRate(signedChangeRate: Double?) {
        this.signedChangeRate = signedChangeRate
    }

    fun getTradeVolume(): Double? {
        return tradeVolume
    }

    fun setTradeVolume(tradeVolume: Double?) {
        this.tradeVolume = tradeVolume
    }

    fun getAccTradePrice(): Double? {
        return accTradePrice
    }

    fun setAccTradePrice(accTradePrice: Double?) {
        this.accTradePrice = accTradePrice
    }

    fun getAccTradePrice24h(): Double? {
        return accTradePrice24h
    }

    fun setAccTradePrice24h(accTradePrice24h: Double?) {
        this.accTradePrice24h = accTradePrice24h
    }

    fun getAccTradeVolume(): Double? {
        return accTradeVolume
    }

    fun setAccTradeVolume(accTradeVolume: Double?) {
        this.accTradeVolume = accTradeVolume
    }

    fun getAccTradeVolume24h(): Double? {
        return accTradeVolume24h
    }

    fun setAccTradeVolume24h(accTradeVolume24h: Double?) {
        this.accTradeVolume24h = accTradeVolume24h
    }

    fun getHighest52WeekPrice(): Double? {
        return highest52WeekPrice
    }

    fun setHighest52WeekPrice(highest52WeekPrice: Double?) {
        this.highest52WeekPrice = highest52WeekPrice
    }

    fun getHighest52WeekDate(): String? {
        return highest52WeekDate
    }

    fun setHighest52WeekDate(highest52WeekDate: String?) {
        this.highest52WeekDate = highest52WeekDate
    }

    fun getLowest52WeekPrice(): Double? {
        return lowest52WeekPrice
    }

    fun setLowest52WeekPrice(lowest52WeekPrice: Double?) {
        this.lowest52WeekPrice = lowest52WeekPrice
    }

    fun getLowest52WeekDate(): String? {
        return lowest52WeekDate
    }

    fun setLowest52WeekDate(lowest52WeekDate: String?) {
        this.lowest52WeekDate = lowest52WeekDate
    }

    fun getTimestamp(): Long? {
        return timestamp
    }

    fun setTimestamp(timestamp: Long?) {
        this.timestamp = timestamp
    }
}