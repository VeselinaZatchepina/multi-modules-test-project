package com.devgymproject.medcard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MedCardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is MedCard Fragment"
    }
    val text: LiveData<String> = _text
}