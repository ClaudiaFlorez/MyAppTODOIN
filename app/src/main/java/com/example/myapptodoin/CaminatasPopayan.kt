package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasPopayanBinding

class CaminatasPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityCaminatasPopayanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_caminataspopayan)
        //super.onCreate(savedInstanceState)
        binding = ActivityCaminatasPopayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.popayancam.setOnClickListener{
            startActivity(Intent(this,TodoInPopayan::class.java))
        }
    }
}