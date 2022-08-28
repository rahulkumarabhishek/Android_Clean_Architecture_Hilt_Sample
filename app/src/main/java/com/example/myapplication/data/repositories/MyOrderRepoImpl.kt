package com.example.myapplication.data.repositories

import com.example.domain.model.MyOrders
import com.example.domain.repositories.MyOrderRepo
import com.example.myapplication.data.apiservices.ApiService
import javax.inject.Inject

class MyOrderRepoImpl @Inject constructor(private val apiService: ApiService) : MyOrderRepo {
    override suspend fun getAllOrder(): MyOrders {
        return apiService.fetchOrdersObservable()
    }
}