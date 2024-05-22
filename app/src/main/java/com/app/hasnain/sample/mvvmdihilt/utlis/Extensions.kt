package com.app.hasnain.sample.mvvmdihilt.utlis

import android.view.View

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 22/05/2024
 */
fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}