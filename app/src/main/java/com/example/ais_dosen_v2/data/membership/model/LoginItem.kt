package com.example.ais_dosen_v2.data.membership.model

import com.example.ais_dosen_v2.model.membership.model.Login
import com.google.gson.annotations.SerializedName

data class LoginItem (

    @SerializedName("@type")
    val type :String,
    @SerializedName("token")
    val token: String
) {
    fun toLogin(): Login {
        return Login(
            type.orEmpty(),
            token.orEmpty()
        )
    }
}