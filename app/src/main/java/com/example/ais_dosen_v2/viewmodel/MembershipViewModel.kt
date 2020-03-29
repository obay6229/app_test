package com.example.ais_dosen_v2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import com.example.ais_dosen_v2.model.membership.MembershipUseCase
import com.example.ais_dosen_v2.model.membership.model.Login
import com.example.ais_dosen_v2.utils.base.viewmodel.Result
import com.example.ais_dosen_v2.utils.base.viewmodel.addTo
import com.example.ais_dosen_v2.utils.base.viewmodel.genericErrorHandler
import com.example.ais_dosen_v2.utils.base.viewmodel.singleScheduler

class MembershipViewModel(
    private val useCase: MembershipUseCase,
    private val disposable: CompositeDisposable
) : ViewModel() {

    val login = MutableLiveData<Result<Login>>()

    init {
        login.value = Result.default()
    }

    fun getLogin(username: String, password: String) {
        login.value = Result.loading()
        useCase.getLogin(username, password)
            .compose(singleScheduler())
            .subscribe({
                if (it.token == "Mahasiswa tidak valid")
                    login.value = Result.fail("Student ID or Password invalid")
                else
                    login.value = Result.success(it)
            }, { genericErrorHandler(it, login) })
            .addTo(disposable)
    }

    override fun onCleared() {
        if (!disposable.isDisposed) disposable.dispose()
        super.onCleared()
    }
}