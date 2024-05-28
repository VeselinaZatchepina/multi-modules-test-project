package com.devgymproject.domain

import org.koin.dsl.module


val useCaseModule = module {
    single {
        MyUseCase()
    }
}