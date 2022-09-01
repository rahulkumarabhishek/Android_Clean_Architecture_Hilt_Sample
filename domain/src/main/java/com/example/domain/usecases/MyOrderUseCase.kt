package com.example.domain.usecases

import com.example.domain.model.MyOrders
import com.example.domain.repositories.MyOrderRepo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MyOrderUseCase @Inject constructor(private val orderRepo: MyOrderRepo) {
    fun getOrder(): Flow<MyOrders> {
        return orderRepo.getAllOrder()
    }
}