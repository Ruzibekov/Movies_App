package com.example.moviesapp.ui.base

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class BaseFragment(layoutRes: Int) : Fragment(layoutRes) {

    fun navigateTo(id: Int){
        findNavController().navigate(id)
    }
}