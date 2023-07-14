package com.example.moviesapp.ui.screens.splash

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.moviesapp.R
import com.example.moviesapp.ui.base.BaseFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            delay(1000)
            navigateTo(R.id.action_splash_fragment_to_home_fragment)
        }
    }
}