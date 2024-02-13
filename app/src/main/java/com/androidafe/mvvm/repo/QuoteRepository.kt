package com.androidafe.mvvm.repo

import androidx.lifecycle.LiveData
import com.androidafe.mvvm.room.Quote
import com.androidafe.mvvm.room.QuoteDao

class QuoteRepository(private val quoteDao: QuoteDao)  {

    fun getQuotes() : LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

    suspend fun insertQuotes(quote: Quote){
        quoteDao.insertQuote(quote)
    }

}