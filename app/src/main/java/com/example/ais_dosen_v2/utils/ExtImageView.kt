package com.example.ais_dosen_v2.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageUrl(context : Context, url : String){
    Glide.with(context)
        .load(url)
        .centerCrop()
        .into(this)
}