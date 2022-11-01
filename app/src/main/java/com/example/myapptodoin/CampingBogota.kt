package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo2Binding
import com.example.myapptodoin.databinding.ActivityCampingbogotaBinding

class CampingBogota : AppCompatActivity() {
    private lateinit var binding: ActivityCampingbogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampingbogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnbogota7.setOnClickListener {
            startActivity(Intent(this, TodoInBogota::class.java))
        }
    }
}

