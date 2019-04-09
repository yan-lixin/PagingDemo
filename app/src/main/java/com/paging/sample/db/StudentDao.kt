package com.paging.sample.db

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
@Dao
interface StudentDao {

    @Query("SELECT * FROM Student ORDER BY name COLLATE NOCASE ASC")
    fun getAllStudent(): DataSource.Factory<Int, Student>

    @Insert
    fun insert(students: List<Student>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(student: Student)
}