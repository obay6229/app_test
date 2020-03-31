package com.example.ais_dosen_v2.model.main

import com.example.ais_dosen_v2.model.main.model.Lecture
import io.reactivex.Single

interface MainUseCase {

    fun getAcademicYears(): Single<List<String>>

    fun getLectureList(ta: String, gag: String): Single<List<Lecture>>
}