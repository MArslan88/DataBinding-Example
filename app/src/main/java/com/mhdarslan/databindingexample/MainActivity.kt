package com.mhdarslan.databindingexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val quoteTextView = findViewById<TextView>(R.id.quoteText)
        val quoteAuthorView = findViewById<TextView>(R.id.quoteAuthor)

        quoteTextView.text = "Do, or do not. There is no try."
        quoteAuthorView.text = "Yoda"
    }
}