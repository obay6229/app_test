package com.example.ais_dosen_v2.di.features

import com.example.ais_dosen_v2.BuildConfig.BASE_URL
import com.example.ais_dosen_v2.data.membership.MembershipDataStore
import com.example.ais_dosen_v2.data.membership.MembershipRepository
import com.example.ais_dosen_v2.data.membership.remote.MembershipApi
import com.example.ais_dosen_v2.data.membership.remote.MembershipApiClient
import com.example.ais_dosen_v2.model.membership.MembershipInteractor
import com.example.ais_dosen_v2.model.membership.MembershipUseCase
import com.example.ais_dosen_v2.utils.base.data.ApiService
import com.example.ais_dosen_v2.viewmodel.MembershipViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val membershipModule = module {

    single {
        ApiService.createReactiveService(
            MembershipApiClient::class.java,
            get(),
            get(named(BASE_URL))
        )
    }

    single { MembershipApi(get()) }

    single<MembershipRepository> { MembershipDataStore(get()) }

    single<MembershipUseCase> { MembershipInteractor(get()) }

    viewModel { MembershipViewModel(get(), get()) }
}