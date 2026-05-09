package com.mhdarslan.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val quoteLiveData = MutableLiveData("What you give is what you get")

    fun updateQuote(){
        quoteLiveData.value = "you'll see it when you believe it."
    }
}