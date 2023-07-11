package com.example.moviesapp.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.moviesapp.R
import com.example.moviesapp.ui.main.fragments.home.HomeFragment
import com.example.moviesapp.ui.main.fragments.search.SearchFragment
import com.example.moviesapp.ui.main.fragments.watch_list.WatchListFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment: Fragment(R.layout.fragment_main){

    private var bottomNavMain: BottomNavigationView? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        initBottomNav()
    }

    private fun initViews() {

        bottomNavMain = view?.findViewById(R.id.bottom_nav_main)
    }

    private fun initBottomNav(){
        loadFragment(HomeFragment())
        bottomNavMain?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.item_search -> {
                    loadFragment(SearchFragment())
                    true
                }
                R.id.item_watch_list -> {
                    loadFragment(WatchListFragment())
                    true
                }
                else ->{false}
            }
        }
    }

    private fun loadFragment(fragment: Fragment){
        childFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_manager_main, fragment)
            .commit()
    }
}
