package com.Asoom.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asoom.domain.usecase.getMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(private val getMealsUseCase: getMealz): ViewModel(){
     fun getMeals(){
         viewModelScope.launch {
             try {
                 getMealsUseCase()
             }catch (e:Exception){

                 Log.e("MealsViewModel",e.message.toString())
             }
         }
     }
}