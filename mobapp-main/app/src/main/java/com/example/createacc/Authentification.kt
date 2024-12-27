package com.example.createacc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentification)

        // Load SignInFragment by default
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, SignInFragment())
            .commit()
    }
}
