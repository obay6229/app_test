package com.example.ais_dosen_v2.utils.base.data.datastore

class ApiException(val apiError: ApiError, override var response: retrofit2.Response<*>) :
    ResponseException(response)