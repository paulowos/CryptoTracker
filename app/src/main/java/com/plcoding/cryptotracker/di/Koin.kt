package com.plcoding.cryptotracker.di

import com.plcoding.cryptotracker.viewmodel.CoinListViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

object Koin {
    val modules =
        module {
            viewModelOf(::CoinListViewModel)
        }
}
