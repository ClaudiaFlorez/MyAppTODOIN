package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMonumentosbogotaBinding
import com.example.myapptodoin.databinding.ActivityMonumentosvillavoBinding

class MonumentosVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityMonumentosvillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonumentosvillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.planeaydisfrutaaqui13.setOnClickListener {
            startActivity(Intent(this, VillavoRegistro::class.java))
        }
        binding.villavo4.setOnClickListener {
            startActivity(Intent(this, TodoInVillavo::class.java))
        }
    }
}