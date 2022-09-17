package com.example.myapplication0.ui_bar.me

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my art Fragment"
    }
    val text: LiveData<String> = _text
}