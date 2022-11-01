package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityTodoinbogotaBinding
import com.example.myapptodoin.databinding.ActivityTodoinvillavoBinding

class TodoInVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinvillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinvillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmonumentos.setOnClickListener {
            startActivity(Intent(this, MonumentosVillavo::class.java))
        }
        binding.btncaminatavillavo.setOnClickListener {
            startActivity(Intent(this, CaminatasVillavo::class.java))
        }
        binding.btntoursvillavo.setOnClickListener {
            startActivity(Intent(this, Toursvillavo::class.java))

        }
        binding.btncampingvillavo.setOnClickListener {
            startActivity(Intent(this, CampingVillavo::class.java))
        }

        binding.btniniciotodoin.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }
    }
}