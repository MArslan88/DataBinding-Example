package com.mhdarslan.databindingexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.mhdarslan.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val quoteList: ArrayList<Quote> = ArrayList()
        quoteList.add(Quote("Do, or do not. There is no try.", "Yoda"))
        quoteList.add(Quote("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winston Churchill"))
        quoteList.add(Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"))
        quoteList.add(Quote("The only way to do great work is to love what you do.", "Steve Jobs"))
        var quoteObject = quoteList[counter]
        binding.quote = quoteObject

        binding.nextButton.setOnClickListener {
            counter++
            if (counter == quoteList.size) {
                counter = 0
            }
            quoteObject = quoteList[counter]
            binding.quote = quoteObject

        }

        binding.previousButton.setOnClickListener {
            counter--
            if (counter == -1) {
                counter = quoteList.size - 1
            }
            quoteObject = quoteList[counter]
            binding.quote = quoteObject
        }


    }
}