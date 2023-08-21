package com.asoom.domain.repo

import com.asoom.domain.entity.CategoryResponse

interface MealsRepo {

    suspend fun getMealzFromRemote():CategoryResponse


}
