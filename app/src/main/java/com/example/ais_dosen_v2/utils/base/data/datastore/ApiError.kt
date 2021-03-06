package com.example.ais_dosen_v2.utils.base.data.datastore

import com.google.gson.annotations.SerializedName

data class ApiError(
    @SerializedName("status")
    var statusCode: Int = 0,
    @SerializedName("message")
    var message: String = "",
    @SerializedName("code")
    var errorCode: String = ""
)