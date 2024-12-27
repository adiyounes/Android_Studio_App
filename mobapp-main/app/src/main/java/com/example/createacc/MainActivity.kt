package com.example.createacc

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.createacc.fragments.FragmentA
import com.example.createacc.fragments.FragmentB

class MainActivity : AppCompatActivity() {

    private var isShowingFragmentA = true

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // Display the initial fragment
        showFragment(FragmentA())

        // Handle fragment switch on button click
        findViewById<Button>(R.id.btn_switch_fragment).setOnClickListener {
            toggleFragment()
        }
    }

    private fun toggleFragment() {
        val fragment = if (isShowingFragmentA) FragmentB() else FragmentA()
        showFragment(fragment)
        isShowingFragmentA = !isShowingFragmentA
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}
