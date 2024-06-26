package com.devgymproject.lightpsp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.devgymproject.lightpsp.databinding.FragmentLightPspBinding
import org.koin.androidx.scope.ScopeFragment

class LightPspFragment : ScopeFragment() {

    private var _binding: FragmentLightPspBinding? = null

    private val binding: FragmentLightPspBinding? get() = _binding
    private val viewModel: LightPspViewModel by scope.inject<LightPspViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLightPspBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val composeView = _binding?.composeView
        composeView?.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    Text(text = "This is Light Psp Dashboard")
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        println(viewModel.toString())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}