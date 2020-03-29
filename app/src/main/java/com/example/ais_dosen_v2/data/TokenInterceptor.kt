package com.example.ais_dosen_v2.data

import com.example.ais_dosen_v2.utils.base.pref.PrefManager
import com.example.ais_dosen_v2.utils.key.UserPreferenceKey
import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor(
    private val preferenceManager: PrefManager
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()

        val request = original.newBuilder()
            .header("token", preferenceManager.getString(UserPreferenceKey.TOKEN))
            .method(original.method(), original.body())
            .build()

        return chain.proceed(request)
    }
}