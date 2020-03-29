package com.example.ais_dosen_v2.data.membership.remote

import com.example.ais_dosen_v2.data.membership.model.LoginItem
import com.example.ais_dosen_v2.utils.base.data.ApiResponse
import com.example.ais_dosen_v2.utils.base.data.WebApi
import io.reactivex.Single
import retrofit2.Response

class MembershipApi(private val apiClient: MembershipApiClient) : WebApi, MembershipApiClient {

    override fun getLogin(
        username: String,
        password: String
    ): Single<Response<ApiResponse<LoginItem>>> {
        return apiClient.getLogin(username, password)
    }

}