package com.devgymproject.pillbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.devgymproject.pillbox.databinding.FragmentPillboxBinding
import org.koin.androidx.scope.ScopeFragment

class PillboxFragment : ScopeFragment() {

    private var _binding: FragmentPillboxBinding? = null

    private val binding: FragmentPillboxBinding? get() = _binding
    private val viewModel: PillboxViewModel by scope.inject<PillboxViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPillboxBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val composeView = _binding?.composeView
        composeView?.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    Text(text = "This is Pillbox Dashboard")
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