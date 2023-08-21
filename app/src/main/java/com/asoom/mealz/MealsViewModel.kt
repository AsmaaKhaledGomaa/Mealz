package com.asoom.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asoom.domain.entity.CategoryResponse
import com.asoom.domain.usecase.getMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(private val getMealsUseCase: getMealz): ViewModel(){

    private val  _categories: MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val categories: StateFlow<CategoryResponse?> = _categories

     fun getMeals(){
         viewModelScope.launch {
             try {
                  _categories.value = getMealsUseCase()
             }catch (e:Exception){

                 Log.e("MealsViewModel",e.message.toString())
             }
         }
     }
}