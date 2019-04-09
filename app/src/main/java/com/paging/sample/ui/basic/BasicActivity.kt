package com.paging.sample.ui.basic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.paging.sample.R
import com.paging.sample.db.Student
import com.paging.sample.viewmodel.CommonViewModel
import kotlinx.android.synthetic.main.activity_basic_usage.*

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
class BasicActivity : AppCompatActivity() {

    private val viewModel by lazy(LazyThreadSafetyMode.NONE) {
        ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return CommonViewModel(application) as T
            }
        }).get(CommonViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_usage)

        val basicAdapter = BasicAdapter()
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@BasicActivity)
            adapter = basicAdapter
        }
        viewModel.getRefreshLiveData().observe(this,
            Observer<PagedList<Student>> {
                basicAdapter.submitList(it)
            })
    }
}