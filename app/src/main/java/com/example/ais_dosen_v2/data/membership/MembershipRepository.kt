package com.example.ais_dosen_v2.data.membership

import com.example.ais_dosen_v2.data.membership.model.LoginItem
import com.example.ais_dosen_v2.utils.base.data.BaseRepository
import io.reactivex.Single

interface MembershipRepository : BaseRepository {

    fun getLogin(username: String, password: String): Single<LoginItem>
}