package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMainBinding
import com.example.myapptodoin.databinding.ActivityTodoinsomosBinding

class TodoInSomos : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinsomosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((R.style.Theme_MyAppTODOIN))
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinsomosBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.boxsomos.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btninicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
