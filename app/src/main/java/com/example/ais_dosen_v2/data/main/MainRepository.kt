package com.example.ais_dosen_v2.data.main

import com.example.ais_dosen_v2.data.main.model.AcademicYearItem
import com.example.ais_dosen_v2.utils.base.data.BaseRepository
import io.reactivex.Single

interface MainRepository : BaseRepository {

    fun getAcademicYears(): Single<List<AcademicYearItem>>
}