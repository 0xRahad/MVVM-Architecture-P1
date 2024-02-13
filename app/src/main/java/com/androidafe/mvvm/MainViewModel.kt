package com.androidafe.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androidafe.mvvm.repo.QuoteRepository
import com.androidafe.mvvm.room.Quote
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() : LiveData<List<Quote>> {
        return quoteRepository.getQuotes()
    }

    fun insertQuotes(quote: Quote){
        viewModelScope.launch(Dispatchers.IO) {
            quoteRepository.insertQuotes(quote)
        }
    }

}