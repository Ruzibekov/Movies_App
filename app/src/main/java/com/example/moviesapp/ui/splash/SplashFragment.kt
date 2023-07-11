package com.example.moviesapp.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.moviesapp.R
import com.example.moviesapp.ui.main.MainFragment

class SplashFragment : Fragment(R.layout.fragment_splash){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openMainFragment()
    }

    private fun openMainFragment() {
        Handler(Looper.getMainLooper()).postDelayed({
            val fragmentManager = requireFragmentManager()
            val transaction = fragmentManager.beginTransaction()
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.replace(R.id.root_container, MainFragment())
            transaction.commit()
        },2600)
    }
}