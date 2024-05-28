package com.devgymproject.lightpsp.di

import com.devgymproject.domain.MyUseCase
import com.devgymproject.lightpsp.LightPspFragment
import com.devgymproject.lightpsp.LightPspViewModel
import org.koin.dsl.module

val lightPspModule = module {
    scope<LightPspFragment> {
        scoped {
           LightPspViewModel(get())
        }
    }

    factory {
        MyUseCase()
    }
}

/*
fun Fragment.getOrCreateScope(scopeId: String): Scope {
    val scope = getScopeOrNull() ?: createScope()
    val activityScope = activity?.getScopeOrNull()
    activityScope?.let { scope.linkTo(it) }
    val customScope = getKoin().getScopeOrNull(scopeId) ?: getKoin().createScope(scopeId, named(scopeId))
    customScope.linkTo(scope)
    lifecycle.addObserver(object : LifecycleEventObserver {

        override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
            if (event == Lifecycle.Event.ON_DESTROY && customScope.closed.not()) {
                customScope.close()
            }
        }
    })
    return customScope
}*/
