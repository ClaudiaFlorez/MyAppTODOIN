package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo1Binding
import com.example.myapptodoin.databinding.ActivityBogotaInfo2Binding

class BogotaInfo2 : AppCompatActivity() {
    private lateinit var binding: ActivityBogotaInfo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBogotaInfo2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmapabogota.setOnClickListener {
            startActivity(Intent(this, BogotaRegistro::class.java))
        }
        binding.btnplanesbogota.setOnClickListener {
            startActivity(Intent(this, TodoInBogota::class.java))
        }
        binding.btndeatras6.setOnClickListener {
            startActivity(Intent(this, BogotaInfo1::class.java))
        }
    }
}