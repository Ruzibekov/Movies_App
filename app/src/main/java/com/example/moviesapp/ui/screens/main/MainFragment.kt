package com.example.moviesapp.ui.screens.main

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.moviesapp.R
import com.example.moviesapp.ui.base.BaseFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : BaseFragment(R.layout.fragment_main) {

    private var bottomNavigation: BottomNavigationView? = null
    private var navHostFragment: NavHostFragment? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.initViews()
        initNavigation()
    }

    private fun View.initViews() {
        bottomNavigation = findViewById(R.id.bottom_nav_main)
    }

    private fun initNavigation() {
        navHostFragment = (childFragmentManager.findFragmentById(
            R.id.home_fragment_container
        ) as NavHostFragment).also {
            bottomNavigation?.setupWithNavController(it.navController)
        }
    }
}