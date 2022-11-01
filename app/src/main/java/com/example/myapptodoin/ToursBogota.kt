package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo2Binding
import com.example.myapptodoin.databinding.ActivityToursbogotaBinding

class ToursBogota : AppCompatActivity() {
    private lateinit var binding: ActivityToursbogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToursbogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.bogot6.setOnClickListener {
            startActivity(Intent(this, TodoInBogota::class.java))
    }
}

    }
    /*binding.btnplanesbogota.setOnClickListener {
        startActivity(Intent(this, TodoInBogota::class.java))
    }
    binding.btndeatras6.setOnClickListener {
        startActivity(Intent(this, BogotaInfo1::class.java))*/