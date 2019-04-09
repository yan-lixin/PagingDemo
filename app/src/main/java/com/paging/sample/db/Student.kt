package com.paging.sample.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
@Entity
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String
)