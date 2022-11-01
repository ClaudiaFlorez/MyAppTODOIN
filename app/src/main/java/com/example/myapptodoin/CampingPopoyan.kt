package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCampingPopoyanBinding

class CampingPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityCampingPopoyanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampingPopoyanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.popayancam.setOnClickListener{
            startActivity(Intent(this,TodoInPopayan::class.java))
        }
    }
}