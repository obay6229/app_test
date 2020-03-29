package com.example.ais_dosen_v2.utils.base.viewmodel

import androidx.lifecycle.MutableLiveData
import com.google.gson.JsonSyntaxException
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import com.example.ais_dosen_v2.utils.base.data.datastore.ApiException
import java.io.IOException
import java.net.SocketTimeoutException

fun <T> singleScheduler(
    subscriberScheduler: Scheduler = Schedulers.io(),
    observerScheduler: Scheduler = AndroidSchedulers.mainThread()
): SingleSchedulerTransformer<T> {
    return SingleSchedulerTransformer(subscriberScheduler, observerScheduler)
}

fun Disposable.addTo(disposable: CompositeDisposable) {
    disposable.add(this)
}

fun <T> genericErrorHandler(e: Throwable, result: MutableLiveData<Result<T>>) {
    // TODO: 28/11/18 define a proper Error Message
    when (e) {
        is ApiException -> result.value = Result.fail(e, e.apiError.message)
        is SocketTimeoutException -> result.value = Result.fail(e, "Connection Timeout")
        is IOException -> result.value = Result.fail(e, "Connection IOException")
        is JsonSyntaxException -> result.value = Result.fail(e, "JSON Exception")
        else -> result.value = Result.fail(e, "An unknown error occurred")
    }
}