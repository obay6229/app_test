package com.example.ais_dosen_v2.di

import com.google.gson.Gson
import org.koin.dsl.module

val utilityModule = module {

    single { Gson() }

}
