package com.example.domain.repositories

import com.example.domain.model.MyOrders
import kotlinx.coroutines.flow.Flow

interface MyOrderRepo {
     fun getAllOrder() : Flow<MyOrders>
}