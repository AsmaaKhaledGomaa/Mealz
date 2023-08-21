package com.asoom.mealz.di

import com.asoom.data.remote.ApiService
import com.asoom.data.repo.MealsRepoIMP
import com.asoom.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo{
        return MealsRepoIMP(apiService)
    }
}