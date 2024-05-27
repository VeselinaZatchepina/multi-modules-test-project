package com.devgymproject.lightpsp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import com.devgymproject.lightpsp.databinding.FragmentLightPspBinding

class LightPspFragment : Fragment() {

    private var _binding: FragmentLightPspBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding: FragmentLightPspBinding? get() = _binding
/*    val mainDashboardViewModel =
        ViewModelProvider(this).get(MainDashboardViewModel::class.java)*/

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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}