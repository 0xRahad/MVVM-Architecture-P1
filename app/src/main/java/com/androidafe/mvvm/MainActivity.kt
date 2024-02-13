package com.androidafe.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.androidafe.mvvm.databinding.ActivityMainBinding
import com.androidafe.mvvm.repo.QuoteRepository
import com.androidafe.mvvm.room.Quote
import com.androidafe.mvvm.room.QuoteDB
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dao = QuoteDB.getDatabase(applicationContext).quoteDao()
        val repository = QuoteRepository(dao)
        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.getQuotes().observe(this, Observer {
            binding.quote = it.toString()
        })

        binding.addQuote.setOnClickListener {
            val quote = Quote(0, "This is testing", "Testing")
            mainViewModel.insertQuotes(quote)
        }


    }
}