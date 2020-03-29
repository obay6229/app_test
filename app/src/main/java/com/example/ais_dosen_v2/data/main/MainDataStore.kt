package com.example.ais_dosen_v2.data.main

import com.example.ais_dosen_v2.data.main.model.AcademicYearItem
import com.example.ais_dosen_v2.data.main.remote.MainApi
import com.example.ais_dosen_v2.utils.base.data.datastore.singleApiError
import io.reactivex.Single

class MainDataStore(api: MainApi) : MainRepository {

    override val dbService = null

    override val webService = api

    override fun getAcademicYears(): Single<List<AcademicYearItem>> {
        return webService.getAcademicYears()
            .lift(singleApiError())
            .map { it.data }
    }
}