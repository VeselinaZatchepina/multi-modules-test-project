package com.devgymproject.maindashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import com.devgymproject.deeplink.navigateToLightPsp
import com.devgymproject.deeplink.navigateToPillbox
import com.devgymproject.deeplink.navigateToStepCounter
import com.devgymproject.maindashboard.databinding.FragmentMainDashboardBinding
import com.devgymproject.ui.LightPspCard

class MainDashboardFragment : Fragment() {

    private var _binding: FragmentMainDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding: FragmentMainDashboardBinding? get() = _binding
/*    val mainDashboardViewModel =
        ViewModelProvider(this).get(MainDashboardViewModel::class.java)*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainDashboardBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val composeView = _binding?.composeView
        composeView?.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MaterialTheme {
                    Column {
                        LightPspCard(
                            text = "LightPsp",
                            status = "Init",
                            onClick = { findNavController().navigateToLightPsp() }
                        )
                        
                        LightPspCard(
                            text = "Pillbox",
                            status = "Init",
                            onClick = { findNavController().navigateToPillbox() }
                        )
                        LightPspCard(
                            text = "StepCounter",
                            status = "Init",
                            onClick = { findNavController().navigateToStepCounter() }
                        )
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}