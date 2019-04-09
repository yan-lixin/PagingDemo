package com.paging.sample

import java.util.concurrent.Executors

/**
 * Copyright (c), 2018-2019
 * @author: lixin
 * Date: 2019/4/9
 * Description:
 */
private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

fun ioThread(f: () -> Unit) {
    IO_EXECUTOR.execute(f)
}