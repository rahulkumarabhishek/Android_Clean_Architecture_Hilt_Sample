package com.example.myapplication.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.domain.usecases.MyOrderUseCase
import com.example.myapplication.utils.ApiResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val orderUseCase: MyOrderUseCase) :
    ViewModel() {

    fun getOrder() = liveData {
        orderUseCase.getOrder().onStart {
            //data loading
            emit(ApiResult.Loading(true))
        }.catch {
            //catch exception
        }.collect {
            //successful data
            emit(ApiResult.Success(it))
        }
    }

}