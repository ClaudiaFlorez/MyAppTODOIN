package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasvillavoBinding
import com.example.myapptodoin.databinding.ActivityCampingvillavoBinding

class CampingVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityCampingvillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampingvillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.villavo3.setOnClickListener {
            startActivity(Intent(this,TodoInVillavo::class.java))
        }
    }
}