package com.example.hammersystems.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hammersystems.ui.view.fragments.MainFragment
import com.example.hammersystems.R
import com.example.hammersystems.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentTransaction =supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.general_fragment, MainFragment())
        fragmentTransaction.commit()

    }
}