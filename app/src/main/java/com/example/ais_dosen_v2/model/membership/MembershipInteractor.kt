package com.example.ais_dosen_v2.model.membership

import com.example.ais_dosen_v2.data.membership.MembershipRepository
import com.example.ais_dosen_v2.model.membership.model.Login
import io.reactivex.Single

class MembershipInteractor(private val repository: MembershipRepository) : MembershipUseCase {

    override fun getLogin(username: String, password: String): Single<Login> {
        return repository.getLogin(username, password).map {
            it.toLogin()
        }
    }
}