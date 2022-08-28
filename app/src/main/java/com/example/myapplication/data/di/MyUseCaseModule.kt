package com.example.myapplication.data.di

import com.example.domain.usecases.MyOrderUseCase
import com.example.myapplication.data.repositories.MyOrderRepoImpl
import com.example.myapplication.data.apiservices.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MyUseCaseModule {
    @Provides
    fun provideMyOrderRepoImpl(apiService: ApiService) : MyOrderRepoImpl {
        return MyOrderRepoImpl(apiService)
    }

    @Provides
    fun provideMyUseCaseModule(myOrderRepoImpl: MyOrderRepoImpl):MyOrderUseCase{
        return MyOrderUseCase(myOrderRepoImpl)
    }
}