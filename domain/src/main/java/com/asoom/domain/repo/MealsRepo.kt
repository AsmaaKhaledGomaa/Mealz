package com.asoom.domain.repo

import com.asoom.domain.entity.CategoryResponse

interface MealsRepo {

    fun getMealzFromRemote():CategoryResponse


}
