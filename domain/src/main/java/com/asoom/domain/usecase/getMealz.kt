package com.asoom.domain.usecase

import com.asoom.domain.repo.MealsRepo

class getMealz(private val mealzrepo:MealsRepo){

    suspend operator fun invoke() = mealzrepo.getMealzFromRemote()
}