package com.example.ais_dosen_v2.utils.base.data

import com.google.gson.annotations.SerializedName

class ApiResponse<T> {

    @SerializedName("code")
    val code: String? = null
    @SerializedName("status")
    val status: String? = null
    @SerializedName("data")
    val data: T? = null
    @SerializedName("tahunAkademik")
    val tahunAkademik: T? = null
    @SerializedName("perkuliahan")
    val perkuliahan: T? = null
    @SerializedName("pbb")
    val pbb: T? = null
    @SerializedName("wisuda")
    val wisuda: T? = null
    @SerializedName("nilai")
    val nilai: T? = null
}