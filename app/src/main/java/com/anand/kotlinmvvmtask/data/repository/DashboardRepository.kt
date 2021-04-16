package com.anand.kotlinmvvmtask.data.repository

import com.anand.kotlinmvvmtask.data.api.ApiService

class DashboardRepository (private val apiService: ApiService): BaseRepository() {

    suspend fun tracksApi(url: String) = apiService.getTracksApi(url)
}