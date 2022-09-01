package com.example.myapplication.presentation

import com.example.domain.usecases.MyOrderUseCase
import com.example.myapplication.fakerepository.MyOrderFakeRepo
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

internal class MainActivityViewModelTest {

    private lateinit var myOrderUseCase: MyOrderUseCase

    @Before
    fun setUp() {
        myOrderUseCase = MyOrderUseCase(MyOrderFakeRepo())
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun getOrder() {
        val res = myOrderUseCase.getOrder()
        var list:List<Long>? = null
        runTest {
            res.collect {
                list = it.orders
            }
        }
        assertEquals(2,list?.size)
    }
}