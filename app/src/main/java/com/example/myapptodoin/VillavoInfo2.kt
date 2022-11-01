package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo2Binding
import com.example.myapptodoin.databinding.ActivityVillavoinfo2Binding

class VillavoInfo2 : AppCompatActivity() {
    private lateinit var binding: ActivityVillavoinfo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVillavoinfo2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmapavillavo2.setOnClickListener {
            startActivity(Intent(this, MapaVillavo::class.java))
        }
        binding.btnplanesparahacerenvillavo2.setOnClickListener {
            startActivity(Intent(this, TodoInVillavo::class.java))
        }
        binding.btndeatras2.setOnClickListener {
            startActivity(Intent(this, VillavoInfo1::class.java))
        }
    }
}