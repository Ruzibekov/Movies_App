package com.example.moviesapp.ui.screens.home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.moviesapp.R
import com.example.moviesapp.ui.base.BaseFragment

class HomeFragment : BaseFragment(R.layout.fragment_home) {

    private var navController: NavController? = null
    private var btnOpenDetails: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.initViews()
        initListeners()
    }

    private fun View.initViews() {
        btnOpenDetails = findViewById(R.id.btn_open_details)
        navController = activity?.findNavController(R.id.main_fragment_container)
    }

    private fun initListeners() {
        btnOpenDetails?.setOnClickListener {
            navController?.navigate(R.id.action_main_fragment_to_details_fragment)
        }
    }

}