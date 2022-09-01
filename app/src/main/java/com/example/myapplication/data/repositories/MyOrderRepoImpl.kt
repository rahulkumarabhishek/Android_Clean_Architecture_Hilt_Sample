package com.example.myapplication.data.repositories

import com.example.domain.model.MyOrders
import com.example.domain.repositories.MyOrderRepo
import com.example.myapplication.data.apiservices.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class MyOrderRepoImpl @Inject constructor(private val apiService: ApiService) : MyOrderRepo {
    override fun getAllOrder(): Flow<MyOrders> {
        return flow {
            emit(apiService.fetchOrdersObservable())
        }.flowOn(Dispatchers.IO)
    }
}