package com.example.ais_dosen_v2.view.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.ais_dosen_v2.R
import com.example.ais_dosen_v2.R.layout
import com.example.ais_dosen_v2.view.main.pages.AttendanceFragment
import com.example.ais_dosen_v2.view.main.pages.LectureFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        setupViewPagerMain()

        bottom_nav_main.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_lecture -> {
                    vpMain.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_report -> {
                    vpMain.currentItem = 1
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    private fun setupViewPagerMain() {
        val pages = listOf(
            LectureFragment.newInstance(),
            AttendanceFragment.newInstance()
        )


        vpMain.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        vpMain.adapter = PagerAdapter(pages, supportFragmentManager, lifecycle)
        vpMain.offscreenPageLimit = 4
        vpMain.isUserInputEnabled = false
    }
}
