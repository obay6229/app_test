package com.example.ais_dosen_v2.di

import com.example.ais_dosen_v2.BuildConfig
import com.example.ais_dosen_v2.BuildConfig.BASE_URL
import com.example.ais_dosen_v2.data.TokenInterceptor
import com.example.ais_dosen_v2.utils.base.data.OkHttpClientFactory
import org.koin.core.qualifier.named
import org.koin.dsl.module

val apiModule = module {

    single {
        return@single OkHttpClientFactory.create(
            interceptors = TokenInterceptor(get()),
            showDebugLog = BuildConfig.DEBUG
        )
    }

    single(named(BASE_URL)) { BASE_URL }
}