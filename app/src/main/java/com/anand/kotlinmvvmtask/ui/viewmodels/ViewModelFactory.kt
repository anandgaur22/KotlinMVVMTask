package com.anand.kotlinmvvmtask.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anand.kotlinmvvmtask.data.repository.BaseRepository
import com.anand.kotlinmvvmtask.data.repository.DashboardRepository

class ViewModelFactory(private val repository: BaseRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(DashboardViewModel::class.java) -> DashboardViewModel(
                    repository as DashboardRepository
                    ) as T

            else -> throw IllegalArgumentException("Unknown class name")
        }
    }

}
