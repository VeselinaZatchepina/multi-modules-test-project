package com.devgymproject.pillbox

import androidx.lifecycle.ViewModel
import com.devgymproject.domain.MyUseCase

class PillboxViewModel(
    private val useCase: MyUseCase,
) : ViewModel() {

    init {
        useCase.print()
    }
}