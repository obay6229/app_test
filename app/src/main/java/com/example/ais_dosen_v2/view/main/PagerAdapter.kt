package com.example.ais_dosen_v2.view.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(
    private val fragmentList: List<Fragment>,
    fragmentManger: FragmentManager,
    lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManger, lifecycle) {

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment = fragmentList[position]
}

