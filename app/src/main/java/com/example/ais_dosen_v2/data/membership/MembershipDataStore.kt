package com.example.ais_dosen_v2.data.membership

import com.example.ais_dosen_v2.data.membership.model.LoginItem
import com.example.ais_dosen_v2.data.membership.remote.MembershipApi
import com.example.ais_dosen_v2.utils.base.data.datastore.singleApiError
import io.reactivex.Single

class MembershipDataStore(api: MembershipApi) : MembershipRepository {

    override val dbService = null

    override val webService = api

    override fun getLogin(username: String, password: String): Single<LoginItem> {
        return webService.getLogin(username, password)
            .lift(singleApiError())
            .map { it.data }
    }
}