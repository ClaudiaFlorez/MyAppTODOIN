package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasbogotaBinding
import com.example.myapptodoin.databinding.ActivityMonumentosbogotaBinding

class CaminatasBogota : AppCompatActivity() {
    private lateinit var binding: ActivityCaminatasbogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaminatasbogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnbogota2.setOnClickListener {
            startActivity(Intent(this,TodoInBogota::class.java))
    }

}


    }
