package com.Asoom.mealz.di

import com.asoom.domain.repo.MealsRepo
import com.asoom.domain.usecase.getMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideuseCaseModule(mealsRepo: MealsRepo): getMealz{
        return getMealz(mealsRepo)

    }

}