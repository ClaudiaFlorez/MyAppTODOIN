package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo1Binding

class BogotaInfo1 : AppCompatActivity() {
    private lateinit var binding: ActivityBogotaInfo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBogotaInfo1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmas1.setOnClickListener {
            startActivity(Intent(this, BogotaInfo2::class.java))
        }
    }
}


