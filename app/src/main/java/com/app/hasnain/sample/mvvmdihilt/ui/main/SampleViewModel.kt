package com.app.hasnain.sample.mvvmdihilt.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 22/05/2024
 */

@HiltViewModel
class SampleViewModel @Inject constructor(): ViewModel() {
    private val _data=MutableLiveData<String> ()
    val data: LiveData<String> get() = _data

    fun loadData (){
        _data.value="Demo App for MVVM + HILT + Data Binding"
    }
}