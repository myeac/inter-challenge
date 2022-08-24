package com.example.inter_challenge.application

import android.app.Application
import com.example.inter_challenge.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GitHubKoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@GitHubKoinApplication)
            modules(appModules)
        }
    }

}