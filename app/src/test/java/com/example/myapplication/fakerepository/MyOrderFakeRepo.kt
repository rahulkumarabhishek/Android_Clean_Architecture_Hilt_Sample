package com.example.myapplication.fakerepository

import com.example.domain.model.MyOrders
import com.example.domain.repositories.MyOrderRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MyOrderFakeRepo : MyOrderRepo {
    override fun getAllOrder(): Flow<MyOrders> {
        return flow {
            emit(MyOrders(listOf(1,2)))
        }
    }
}