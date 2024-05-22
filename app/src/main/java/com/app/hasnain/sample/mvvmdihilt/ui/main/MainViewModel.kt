package com.app.hasnain.sample.mvvmdihilt.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.hasnain.sample.mvvmdihilt.data.model.User
import com.app.hasnain.sample.mvvmdihilt.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 21/05/2024
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository): ViewModel() {
    private val _user=MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    fun loadUser(){
        _user.value=userRepository.getUser()
    }
}