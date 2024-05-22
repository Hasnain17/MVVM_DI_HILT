package com.app.hasnain.sample.mvvmdihilt.data.di

import com.app.hasnain.sample.mvvmdihilt.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 21/05/2024
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository{
        return UserRepository()
    }
}