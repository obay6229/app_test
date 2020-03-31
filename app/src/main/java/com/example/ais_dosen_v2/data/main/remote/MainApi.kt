package com.example.ais_dosen_v2.data.main.remote

import com.example.ais_dosen_v2.data.main.model.AcademicYearItem
import com.example.ais_dosen_v2.data.main.model.LectureItem
import com.example.ais_dosen_v2.utils.base.data.ApiResponse
import com.example.ais_dosen_v2.utils.base.data.WebApi
import io.reactivex.Single
import retrofit2.Response

class MainApi(private val apiClient: MainApiClient) : WebApi, MainApiClient {

    override fun getAcademicYears(): Single<Response<ApiResponse<List<AcademicYearItem>>>> {
        return apiClient.getAcademicYears()
    }

    override fun getLectureList(
        ta: String,
        gag: String
    ): Single<Response<ApiResponse<List<LectureItem>>>> {
        return apiClient.getLectureList(ta, gag)
    }
}