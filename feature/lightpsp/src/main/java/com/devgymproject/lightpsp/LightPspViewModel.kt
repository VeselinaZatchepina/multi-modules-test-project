package com.devgymproject.lightpsp

import androidx.lifecycle.ViewModel
import com.devgymproject.domain.MyUseCase

class LightPspViewModel(
    private val useCase: MyUseCase,
) : ViewModel() {

    init {
        useCase.print()
    }
}