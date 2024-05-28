package com.devgymproject.pillbox.di

import com.devgymproject.domain.MyUseCase
import com.devgymproject.pillbox.PillboxFragment
import com.devgymproject.pillbox.PillboxViewModel
import org.koin.dsl.module

val pillboxModule = module {
    scope<PillboxFragment> {
        scoped {
           PillboxViewModel(
               useCase = get()
           )
        }
      /*  scoped {
            MyUseCase()
        }*/
    }

    factory {
        MyUseCase()
    }
}