package com.example.moviesapp.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import com.example.moviesapp.R
import com.example.moviesapp.ui.main.MainFragment

class SplashFragment : Fragment(R.layout.fragment_splash){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openMainFragment()
    }

    private fun openMainFragment() {
        Handler(Looper.getMainLooper()).postDelayed({
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.root_container, MainFragment())
            transaction.commit()
        },2600)
    }
}