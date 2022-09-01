package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.myapplication.R
import com.example.myapplication.utils.ApiStatus
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private  val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getOrder().observe(this){
            when(it.status){
                ApiStatus.SUCCESS ->{
                    Log.e("MainActivity rsponse=",it.data.toString())
                }
                ApiStatus.ERROR -> {
                    Log.e("MainActivity rsponse=",it.data.toString())
                }
                ApiStatus.LOADING -> {
                    Log.e("MainActivity rsponse=","loading....")
                }
            }
        }
    }
}