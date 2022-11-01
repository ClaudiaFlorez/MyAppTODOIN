package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasbogotaBinding
import com.example.myapptodoin.databinding.ActivityCaminatasvillavoBinding

class CaminatasVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityCaminatasvillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaminatasvillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.villavo.setOnClickListener {
            startActivity(Intent(this,TodoInVillavo::class.java))
        }
    }
}