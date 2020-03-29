package com.example.ais_dosen_v2.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.example.ais_dosen_v2.R
import com.kennyc.view.MultiStateView

fun circularProgressBar(context: Context): Drawable {
    val circularProgressDrawable = CircularProgressDrawable(context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.centerRadius = 30f
    circularProgressDrawable.start()
    return circularProgressDrawable
}

fun emptyString() = ""

fun Spinner.setupSpinnerSemester(semesterList: List<Int>) {
    val semester = mutableListOf<String>()

    semesterList.forEachIndexed { _, i ->
        semester.add("Semester $i")
    }

    context?.let {
        val adapter = ArrayAdapter(
            it,
            R.layout.item_spinner, semester
        )
        this.adapter = adapter
    }
}

fun MultiStateView.showLoadingState() {
    this.viewState = MultiStateView.ViewState.LOADING
}

fun MultiStateView.showErrorState() {
    this.viewState = MultiStateView.ViewState.ERROR
}

fun MultiStateView.showDefaultState() {
    this.viewState = MultiStateView.ViewState.CONTENT
}

fun MultiStateView.showEmptyState() {
    this.viewState = MultiStateView.ViewState.EMPTY
}

fun AppCompatActivity.setupToolbar(
    toolbar: Toolbar?,
    title: String = emptyString(),
    isChild: Boolean = false
) {
    toolbar?.let {
        setSupportActionBar(it)

        if (!isChild) {
            it.navigationIcon = null
        }
    }

    if (supportActionBar != null) {
        supportActionBar!!.title = title
        supportActionBar!!.setDisplayHomeAsUpEnabled(isChild)
    }
}

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}