package com.example.yourapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Splash2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash2)

        val getStartedButton: Button = findViewById(R.id.btn_get_started)

        // Set an OnClickListener to the button
        getStartedButton.setOnClickListener {
            // Navigate to the next activity (e.g., MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Close splash screen
        }
    }
}
