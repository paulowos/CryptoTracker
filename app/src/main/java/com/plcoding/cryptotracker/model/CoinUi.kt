package com.plcoding.cryptotracker.model

import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.domain.Coin
import com.plcoding.cryptotracker.util.getDrawableIdForCoin

data class CoinUi(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val icon: Int,
)

fun Coin.toCoinUi(): CoinUi =
    CoinUi(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        priceUsd = priceUsd.toDisplayableNumber(),
        marketCapUsd = priceUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        icon = getDrawableIdForCoin(symbol),
    )
