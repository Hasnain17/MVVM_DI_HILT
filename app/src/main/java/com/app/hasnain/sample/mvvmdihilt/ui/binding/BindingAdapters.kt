package com.app.hasnain.sample.mvvmdihilt.ui.binding

import android.widget.TextView

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 22/05/2024
 */

fun setText(view: TextView, text:String?){
    view.text=text?:""
}