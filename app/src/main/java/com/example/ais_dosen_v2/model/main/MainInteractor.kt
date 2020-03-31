package com.example.ais_dosen_v2.model.main

import com.example.ais_dosen_v2.data.main.MainRepository
import com.example.ais_dosen_v2.model.main.model.Lecture
import io.reactivex.Single

class MainInteractor(private val repository: MainRepository) : MainUseCase {

    override fun getAcademicYears(): Single<List<String>> {
        return repository.getAcademicYears().map {
            it.map { academicYearItem ->
                academicYearItem.toData()
            }
        }
    }

    override fun getLectureList(ta: String, gag: String): Single<List<Lecture>> {
        return repository.getLectureList(ta, gag).map {
            it.map { lectureItem ->
                lectureItem.toLecture()
            }
        }
    }
}