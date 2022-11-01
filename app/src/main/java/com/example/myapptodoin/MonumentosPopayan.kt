package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMonumentosPopayanBinding

class MonumentosPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityMonumentosPopayanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_caminataspopayan)
        //super.onCreate(savedInstanceState)
        binding = ActivityMonumentosPopayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.popayan4.setOnClickListener{
            startActivity(Intent(this,TodoInPopayan::class.java))
        }
    }
}