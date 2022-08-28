package com.example.myapplication.data.apiservices

import com.example.domain.model.MyOrders
import retrofit2.http.GET

interface ApiService {
    @GET("orders")
    suspend fun fetchOrdersObservable(): MyOrders
}