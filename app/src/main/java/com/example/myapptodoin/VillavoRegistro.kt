package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaregistroBinding
import com.example.myapptodoin.databinding.ActivityVillavoregistroBinding

class VillavoRegistro : AppCompatActivity() {
    private lateinit var binding: ActivityVillavoregistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityVillavoregistroBinding.inflate(layoutInflater)
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