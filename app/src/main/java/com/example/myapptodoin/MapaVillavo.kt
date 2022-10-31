package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMapavillavoBinding
import com.example.myapptodoin.databinding.ActivityVillavoinfo1Binding

class MapaVillavo : AppCompatActivity() {
    private lateinit var binding: ActivityMapavillavoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapavillavoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras3.setOnClickListener {
            startActivity(Intent(this, VillavoInfo2::class.java))
        }
    }
}