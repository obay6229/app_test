package com.example.ais_dosen_v2.data.main.remote

import com.example.ais_dosen_v2.data.main.model.AcademicYearItem
import com.example.ais_dosen_v2.utils.base.data.ApiResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface MainApiClient {
    @GET("dosen-v2/ta")
    fun getAcademicYears(): Single<Response<ApiResponse<List<AcademicYearItem>>>>
}