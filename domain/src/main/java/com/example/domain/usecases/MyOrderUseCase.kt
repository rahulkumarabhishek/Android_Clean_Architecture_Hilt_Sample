package com.example.domain.usecases

import com.example.domain.model.MyOrders
import com.example.domain.repositories.MyOrderRepo
import javax.inject.Inject

class MyOrderUseCase @Inject constructor(private val orderRepo: MyOrderRepo) {
    suspend fun getOrder(): MyOrders {
        return orderRepo.getAllOrder()
    }
}