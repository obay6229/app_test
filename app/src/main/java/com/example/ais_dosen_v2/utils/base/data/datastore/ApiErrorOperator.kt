package com.example.ais_dosen_v2.utils.base.data.datastore

import com.google.gson.Gson

fun <T> singleApiError(): SingleApiErrorOperator<T> {
    return SingleApiErrorOperator(Gson())
}

