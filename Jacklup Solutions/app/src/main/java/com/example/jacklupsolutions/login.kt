package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_login.* // Use if you're using Kotlin Android Extensions

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<TextInputEditText>(R.id.email_input)
        val passwordInput = findViewById<TextInputEditText>(R.id.password_input)
        val rememberMe = findViewById<CheckBox>(R.id.checkbox_remember)

        login_button.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Logic to authenticate the user, navigate to the next screen if successful
            if (authenticateUser(email, password)) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Navigate to the home activity or dashboard
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_SHORT).show()
            }
        }

        forgot_password.setOnClickListener {
            // Handle forgot password
            Toast.makeText(this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show()
            // Start activity for password reset
        }

        signup_link.setOnClickListener {
            // Navigate to the sign-up page
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        google_login.setOnClickListener {
            Toast.makeText(this, "Google Login", Toast.LENGTH_SHORT).show()
            // Implement Google login logic
        }

        facebook_login.setOnClickListener {
            Toast.makeText(this, "Facebook Login", Toast.LENGTH_SHORT).show()
            // Implement Facebook login logic
        }

        apple_login.setOnClickListener {
            Toast.makeText(this, "Apple Login", Toast.LENGTH_SHORT).show()
            // Implement Apple login logic
        }
    }

    private fun authenticateUser(email: String, password: String): Boolean {
        // Simulate user authentication (replace with your own auth logic)
        return email == "user@example.com" && password == "password123"
    }
}
