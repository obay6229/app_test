package com.example.ais_dosen_v2.utils.base.data.datastore

open class ResponseException(open var response: retrofit2.Response<*>) : RuntimeException()