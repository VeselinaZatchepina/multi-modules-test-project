package com.devgymproject.maindashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainDashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Main Dashboard Fragment"
    }
    val text: LiveData<String> = _text
}