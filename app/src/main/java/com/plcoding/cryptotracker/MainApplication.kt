package com.plcoding.cryptotracker

import android.app.Application
import com.plcoding.cryptotracker.di.Koin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(Koin.modules)
        }
    }
}
