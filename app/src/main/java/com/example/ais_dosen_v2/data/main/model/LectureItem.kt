package com.example.ais_dosen_v2.data.main.model

import com.example.ais_dosen_v2.model.main.model.Lecture
import com.google.gson.annotations.SerializedName

data class LectureItem(

    @SerializedName("id")
    val id: String?,
    @SerializedName("tahunAkademik")
    val tahunakademik: String?,
    @SerializedName("gag")
    val gag: String?,
    @SerializedName("semester")
    val semester: String?,
    @SerializedName("dosen1")
    val dosen1: String?,
    @SerializedName("dosen1Nama")
    val dosen1nama: String?,
    @SerializedName("dosen2")
    val dosen2: String?,
    @SerializedName("dosen2Nama")
    val dosen2nama: String?,
    @SerializedName("kurikulum")
    val kurikulum: String?,
    @SerializedName("kurikulumNama")
    val kurikulumnama: String?,
    @SerializedName("mk")
    val mk: String?,
    @SerializedName("mkNama")
    val mknama: String?,
    @SerializedName("mkKode")
    val mkkode: String?,
    @SerializedName("mkSks")
    val mksks: String?,
    @SerializedName("program")
    val program: String?,
    @SerializedName("fakultas")
    val fakultas: String?,
    @SerializedName("fakultasNama")
    val fakultasnama: String?,
    @SerializedName("jurusan")
    val jurusan: String?,
    @SerializedName("jurusanNama")
    val jurusannama: String?,
    @SerializedName("ruang")
    val ruang: String?,
    @SerializedName("ruangNama")
    val ruangnama: String?,
    @SerializedName("hari")
    val hari: String?,
    @SerializedName("waktu")
    val waktu: String?,
    @SerializedName("kelas")
    val kelas: String?
) {
    fun toLecture(): Lecture {
        return Lecture(
            id.orEmpty(),
            tahunakademik.orEmpty(),
            gag.orEmpty(),
            semester.orEmpty(),
            dosen1.orEmpty(),
            dosen1nama.orEmpty(),
            dosen2.orEmpty(),
            dosen2nama.orEmpty(),
            kurikulum.orEmpty(),
            kurikulumnama.orEmpty(),
            mk.orEmpty(),
            mknama.orEmpty(),
            mkkode.orEmpty(),
            mksks.orEmpty(),
            program.orEmpty(),
            fakultas.orEmpty(),
            fakultasnama.orEmpty(),
            jurusan.orEmpty(),
            jurusannama.orEmpty(),
            ruang.orEmpty(),
            ruangnama.orEmpty(),
            hari.orEmpty(),
            waktu.orEmpty(),
            kelas.orEmpty()
        )
    }
}