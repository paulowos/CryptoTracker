package com.plcoding.cryptotracker.viewmodel

import androidx.lifecycle.ViewModel
import com.plcoding.cryptotracker.domain.Coin
import com.plcoding.cryptotracker.model.CoinUi
import com.plcoding.cryptotracker.model.toCoinUi

class CoinListViewModel : ViewModel() {
    val coin =
        Coin(
            id = "1",
            name = "Bitcoin",
            rank = 1,
            symbol = "BTC",
            marketCapUsd = 0.0,
            priceUsd = 50000.0,
            changePercent24Hr = -10.0,
        )
    val isLoading: Boolean = false
    val coins: List<CoinUi> = listOf(coin.toCoinUi())
    val selectedCoin: CoinUi? = null
}
