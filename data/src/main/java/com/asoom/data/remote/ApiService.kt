package com.asoom.data.remote

import com.asoom.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {

    @GET("categories.php")
   suspend fun getMeals():CategoryResponse
}