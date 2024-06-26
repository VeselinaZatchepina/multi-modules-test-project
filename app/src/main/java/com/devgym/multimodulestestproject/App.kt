package com.devgym.multimodulestestproject

import android.app.Application
import com.devgymproject.domain.useCaseModule
import com.devgymproject.lightpsp.di.lightPspModule
import com.devgymproject.pillbox.di.pillboxModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            if (BuildConfig.DEBUG) androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(
                useCaseModule
                        + lightPspModule
                        + pillboxModule
            )
        }
    }
}