package com.example.ais_dosen_v2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ais_dosen_v2.model.main.MainUseCase
import com.example.ais_dosen_v2.model.main.model.Lecture
import com.example.ais_dosen_v2.utils.base.viewmodel.Result
import com.example.ais_dosen_v2.utils.base.viewmodel.addTo
import com.example.ais_dosen_v2.utils.base.viewmodel.genericErrorHandler
import com.example.ais_dosen_v2.utils.base.viewmodel.singleScheduler
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(
    private val useCase: MainUseCase,
    private val disposable: CompositeDisposable
) : ViewModel() {

    val academicYears = MutableLiveData<Result<List<String>>>()
    val lectureList = MutableLiveData<Result<List<Lecture>>>()

    init {
        academicYears.value = Result.default()
        lectureList.value = Result.default()
    }

    fun getAcademicYears() {
        academicYears.value = Result.loading()
        useCase.getAcademicYears()
            .compose(singleScheduler())
            .subscribe({
                academicYears.value = Result.success(it)
            }, { genericErrorHandler(it, academicYears) })
            .addTo(disposable)
    }

    fun getLectureList(ta: String, gag: String) {
        lectureList.value = Result.loading()
        useCase.getLectureList(ta, gag)
            .compose(singleScheduler())
            .subscribe({
                lectureList.value = Result.success(it)
            }, { genericErrorHandler(it, lectureList) })
            .addTo(disposable)
    }

    override fun onCleared() {
        if (!disposable.isDisposed) disposable.dispose()
        super.onCleared()
    }
}