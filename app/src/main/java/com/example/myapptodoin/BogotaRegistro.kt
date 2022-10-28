package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotainfo1Binding
import com.example.myapptodoin.databinding.ActivityBogotaregistroBinding

class BogotaRegistro : AppCompatActivity() {
    private lateinit var binding: ActivityBogotaregistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme((R.style.Theme_MyAppTODOIN))
        //Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityBogotaregistroBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnplaneaydisfruta.setOnClickListener {
            startActivity(Intent(this, TodoinExplorarRutas::class.java))
        }
        binding.btninicio1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}


