package com.example.domain.repositories

import com.example.domain.model.MyOrders

interface MyOrderRepo {
    suspend fun getAllOrder() : MyOrders
}