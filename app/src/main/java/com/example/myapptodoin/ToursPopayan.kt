package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityToursPopayanBinding


class ToursPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityToursPopayanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_caminataspopayan)
        //super.onCreate(savedInstanceState)
        binding = ActivityToursPopayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.popa.setOnClickListener{
            startActivity(Intent(this,TodoInPopayan::class.java))
        }
    }
}