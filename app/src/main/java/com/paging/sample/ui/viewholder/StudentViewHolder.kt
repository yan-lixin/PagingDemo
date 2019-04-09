package com.paging.sample.ui.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.paging.sample.R
import com.paging.sample.db.Student

class StudentViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)) {

    private val tvName = itemView.findViewById<TextView>(R.id.name)
    private var student: Student? = null

    fun bindTo(student: Student?) {
        this.student = student
        tvName.text = student?.name
    }

}
