package com.paging.sample.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paging.sample.R
import com.paging.sample.ui.basic.BasicActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtnBasicUsage.setOnClickListener {
            startActivity(Intent(this, BasicActivity::class.java))
        }
    }
}
