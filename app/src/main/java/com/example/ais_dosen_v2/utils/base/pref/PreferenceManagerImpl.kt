package com.example.ais_dosen_v2.utils.base.pref

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class PreferenceManagerImpl(
    private val context: Context,
    private val prefName: String,
    private val gson: Gson
) : PrefManager {

    private val mPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(
            prefName,
            Context.MODE_PRIVATE
        )
    }

    override fun getBoolean(key: String, default: Boolean): Boolean {
        return mPreferences.getBoolean(key, default)
    }

    override fun saveBoolean(key: String, value: Boolean) {
        mPreferences.edit().putBoolean(key, value).apply()
    }

    override fun getInt(key: String, default: Int): Int {
        return mPreferences.getInt(key, default)
    }

    override fun saveInt(key: String, value: Int) {
        mPreferences.edit().putInt(key, value).apply()
    }

    override fun getString(key: String, default: String): String {
        return mPreferences.getString(key, default)!!
    }

    override fun saveString(key: String, value: String) {
        mPreferences.edit().putString(key, value).apply()
    }

    override fun getLong(key: String, default: Long): Long {
        return mPreferences.getLong(key, default)
    }

    override fun saveLong(key: String, value: Long) {
        mPreferences.edit().putLong(key, value).apply()
    }

    override fun getFloat(key: String, default: Float): Float {
        return mPreferences.getFloat(key, default)
    }

    override fun saveFloat(key: String, value: Float) {
        mPreferences.edit().putFloat(key, value).apply()
    }

    override fun <T> getObject(key: String, type: Class<T>): T? {
        val json = getString(key)

        return if (json.isNotEmpty())
            try {
                gson.fromJson(json, type)
            } catch (exception: Exception) {
                null
            }
        else
            null
    }

    override fun saveObject(key: String, value: Any) {
        val json = gson.toJson(value)
        mPreferences.edit().putString(key, json).apply()
    }
}