package com.example.coco.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coco.repository.NetworkRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class SelectViewModel : ViewModel() {

    private val networkRepository = NetworkRepository()

    fun getCurrentCoinList() = viewModelScope.launch {

        val result = networkRepository.getCurrentCoinList()

        Timber.d(result.toString())

    }

}