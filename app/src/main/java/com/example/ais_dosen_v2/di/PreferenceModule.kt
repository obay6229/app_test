package com.example.ais_dosen_v2.di

import com.example.ais_dosen_v2.utils.base.pref.PrefManager
import com.example.ais_dosen_v2.utils.base.pref.PreferenceManagerImpl
import com.example.ais_dosen_v2.utils.key.AppConstants
import org.koin.core.qualifier.named
import org.koin.dsl.module

const val PREFERENCE_NAME = "preference_name"

val preferenceModule = module {

    single(named(PREFERENCE_NAME)) { AppConstants.PREF_NAME }

    single<PrefManager> { PreferenceManagerImpl(get(), get(named(PREFERENCE_NAME)), get()) }

}
