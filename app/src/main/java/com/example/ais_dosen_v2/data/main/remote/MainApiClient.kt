package com.example.ais_dosen_v2.data.main.remote

import com.example.ais_dosen_v2.data.main.model.AcademicYearItem
import com.example.ais_dosen_v2.data.main.model.LectureItem
import com.example.ais_dosen_v2.utils.base.data.ApiResponse
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MainApiClient {
    @GET("dosen-v2/ta")
    fun getAcademicYears(): Single<Response<ApiResponse<List<AcademicYearItem>>>>

    @GET("dosen-v2/perkuliahan/{ta}/{gag}")
    fun getLectureList(@Path("ta") ta: String, @Path("gag") gag: String): Single<Response<ApiResponse<List<LectureItem>>>>
}