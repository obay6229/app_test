package com.example.ais_dosen_v2.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ais_dosen_v2.R
import com.example.ais_dosen_v2.model.main.model.Lecture
import com.example.ais_dosen_v2.utils.circularProgressBar
import com.example.ais_dosen_v2.utils.emptyString
import kotlinx.android.synthetic.main.item_lecture.view.*

class LectureAdapter(
    val listener: OnLectureListener? = null,
    val data: MutableList<Lecture> = mutableListOf()
) :
    RecyclerView.Adapter<LectureAdapter.ViewHolder>() {

    fun setLectureData(lectureList: List<Lecture>) {
        if (data.size > 0) {
            data.clear()
        }
        data.addAll(lectureList)
        notifyDataSetChanged()
    }

    fun addOrUpdate(item: Lecture) {
        val i: Int = data.indexOf(item)
        if (i >= 0) {
            data[i] = item
            notifyDataSetChanged()
        } else {
            data.add(item)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_lecture,
            viewGroup, false
        )
        return LectureViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lectureItem: Lecture = data[position]
        val lectureViewHolder = holder as LectureViewHolder
        lectureViewHolder.bindLectureItem(lectureItem)
    }

    open inner class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class LectureViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bindLectureItem(lectureItem: Lecture) {
            with(itemView) {

                tvLectureClass.text = lectureItem.kelas
                tvLectureName.text = lectureItem.mknama
                tvLectureRoom.text = lectureItem.ruangnama
                tvLectureTime.text = String.format("%s, %s", lectureItem.hari, lectureItem.waktu)
                tvLecturerName.text = lectureItem.dosen1nama

                Glide.with(context)
                    .load(emptyString())
                    .placeholder(circularProgressBar(context))
                    .error(R.drawable.ic_account_circle_white)
                    .into(imgLecturer)

                setOnClickListener {
                    listener?.onLectureItemClicked(lectureItem)
                }
            }
        }
    }

    interface OnLectureListener {
        fun onLectureItemClicked(lectureData: Lecture)
    }
}