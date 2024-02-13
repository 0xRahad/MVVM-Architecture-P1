package com.androidafe.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.androidafe.mvvm.repo.QuoteRepository

class MainViewModelFactory(private val quoteRepository: QuoteRepository) :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(quoteRepository) as T
    }
}