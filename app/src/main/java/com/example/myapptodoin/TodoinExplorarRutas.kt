package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMainBinding
import com.example.myapptodoin.databinding.ActivityTodoinExplorarRutasBinding

class TodoinExplorarRutas : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinExplorarRutasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((R.style.Theme_MyAppTODOIN))
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinExplorarRutasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btningreso.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
        binding.btnregistro.setOnClickListener {
            startActivity(Intent(this, RegistroUsuarioLogin::class.java))

        }
        binding.btnsalir1.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}

