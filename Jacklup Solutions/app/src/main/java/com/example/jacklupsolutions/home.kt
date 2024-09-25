package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_bucket -> {
                    Toast.makeText(this, "Bucket Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_explore -> {
                    Toast.makeText(this, "Explore Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_custom -> {
                    Toast.makeText(this, "Custom Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_profile -> {
                    Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
