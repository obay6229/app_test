package com.example.ais_dosen_v2.view.main.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ais_dosen_v2.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class LectureFragment : Fragment() {

    companion object {
        fun newInstance() =
            LectureFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    private lateinit var lectureAdapter: LectureAdapter

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lecture, container, false)
    }

}
