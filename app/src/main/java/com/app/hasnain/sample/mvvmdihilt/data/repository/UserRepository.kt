package com.app.hasnain.sample.mvvmdihilt.data.repository

import com.app.hasnain.sample.mvvmdihilt.data.model.User
import javax.inject.Inject

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 21/05/2024
 */
class UserRepository @Inject constructor() {
    fun getUser(): User{
        return User(name = "Muhammad Hasnain Altaf", age = 24)
    }
}