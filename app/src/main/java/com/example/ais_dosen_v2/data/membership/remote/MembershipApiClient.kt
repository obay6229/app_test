package com.example.ais_dosen_v2.data.membership.remote

import com.example.ais_dosen_v2.data.membership.model.LoginItem
import com.example.ais_dosen_v2.utils.base.data.ApiResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MembershipApiClient {
    @GET("dosen-v2/login/{username}/{password}")
    fun getLogin(@Path("username") username: String, @Path("password") password: String): Single<Response<ApiResponse<LoginItem>>>


}