package com.paging.sample.ui.basic

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.paging.sample.db.Student
import com.paging.sample.ui.viewholder.StudentViewHolder

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
class BasicAdapter: PagedListAdapter<Student, StudentViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(parent)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Student>() {
            override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
                return oldItem == newItem
            }

        }
    }
}