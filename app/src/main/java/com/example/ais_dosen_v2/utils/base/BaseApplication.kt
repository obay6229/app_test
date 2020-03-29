package com.example.ais_dosen_v2.utils.base

import android.app.Application
import com.example.ais_dosen_v2.di.apiModule
import com.example.ais_dosen_v2.di.features.membershipModule
import com.example.ais_dosen_v2.di.preferenceModule
import com.example.ais_dosen_v2.di.rxModule
import com.example.ais_dosen_v2.di.utilityModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(getDefinedModules())
        }
    }

    private fun getDefinedModules(): List<Module> {
        return listOf(
            membershipModule,
            apiModule,
            preferenceModule,
            rxModule,
            utilityModule
        )
    }
}