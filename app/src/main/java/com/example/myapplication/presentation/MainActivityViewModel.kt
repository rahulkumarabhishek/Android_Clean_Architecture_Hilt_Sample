package com.example.myapplication.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.domain.usecases.MyOrderUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val orderUseCase: MyOrderUseCase) :
    ViewModel() {
    fun getOrder() {
        CoroutineScope(Dispatchers.IO).launch{
            val res =  orderUseCase.getOrder()
            Log.e("MainActivityViewModel",res.toString())
        }
    }
}