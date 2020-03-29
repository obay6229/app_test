package com.example.ais_dosen_v2.data.main.model

import com.google.gson.annotations.SerializedName

data class AcademicYearItem(

    @SerializedName("nama")
    val nama: String
) {
    fun toData(): String {
        return nama
    }
}