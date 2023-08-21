package com.asoom.data.repo

import com.asoom.data.remote.ApiService
import com.asoom.domain.entity.CategoryResponse
import com.asoom.domain.repo.MealsRepo

class MealsRepoIMP(private val apiService: ApiService):MealsRepo{
    override suspend fun getMealzFromRemote(): CategoryResponse = apiService.getMeals()
}