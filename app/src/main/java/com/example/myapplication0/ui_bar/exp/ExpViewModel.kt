package com.example.myapplication0.ui_bar.exp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExpViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is explore Fragment"
    }
    val text: LiveData<String> = _text
}