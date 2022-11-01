package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasvillavoBinding
import com.example.myapptodoin.databinding.ActivityToursvillavoBinding

class Toursvillavo : AppCompatActivity() {
    private lateinit var binding: ActivityToursvillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToursvillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.villavo2.setOnClickListener {
            startActivity(Intent(this,TodoInVillavo::class.java))
        }
    }
}