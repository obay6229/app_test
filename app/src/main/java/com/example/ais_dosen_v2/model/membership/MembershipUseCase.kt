package com.example.ais_dosen_v2.model.membership

import com.example.ais_dosen_v2.model.membership.model.Login
import io.reactivex.Single

interface MembershipUseCase {

    fun getLogin(username: String, password: String): Single<Login>
}