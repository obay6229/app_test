package com.example.ais_dosen_v2.model.main

import io.reactivex.Single

interface MainUseCase {

    fun getAcademicYears(): Single<List<String>>
}