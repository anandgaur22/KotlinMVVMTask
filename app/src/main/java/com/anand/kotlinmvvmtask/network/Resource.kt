package com.anand.kotlinmvvmtask.network

import okhttp3.ResponseBody

sealed class Resource<out T> {
    object Loading : Resource<Nothing>()
     class Success<out T>(val value : T) : Resource<T>()
     class Failure  (
        val isNetworkError: Boolean,
        val errorCode : Int?,
        val errorBody : ResponseBody?
    ): Resource<Nothing>()
}