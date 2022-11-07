package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityPopayanregistroBinding

class PopayanRegistro : AppCompatActivity() {
    private lateinit var binding: ActivityPopayanregistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_popayanregistro)
        binding = ActivityPopayanregistroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.planeaydisfrutaaqui.setOnClickListener {
            startActivity(Intent(this, TodoinExplorarRutas::class.java))
        }
        binding.inicio2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}