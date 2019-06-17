package com.example.iklanin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.iklanin.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment)
        setupBottomNav(navController)
    }

    private fun setupBottomNav(navController: NavController){
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)
        bottomNav.setupWithNavController(navController)
    }
}
