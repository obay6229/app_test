package com.example.ais_dosen_v2.model.main

import com.example.ais_dosen_v2.data.main.MainRepository
import io.reactivex.Single

class MainInteractor(private val repository: MainRepository) : MainUseCase {

    override fun getAcademicYears(): Single<List<String>> {
        return repository.getAcademicYears().map {
            it.map { academicYearItem ->
                academicYearItem.toData()
            }
        }
    }
}