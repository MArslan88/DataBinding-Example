package com.mhdarslan.databindingexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mhdarslan.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post(
            "Não somos uma banda de hair metal, diz baixista do Tesla",
            "Brian Wheat destaca que a sonoridade do grupo se assemelha mais ao Black Crowes do que às bandas farofas.",
            "https://whiplash.net/imagens_promo_22/tesla_divulgacao_tour_2024.jpg")

        binding.post = post
    }
}