package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMapabogotaBinding
import com.example.myapptodoin.databinding.ActivityMapapopayanBinding

class MapaBogota : AppCompatActivity() {
    private lateinit var binding: ActivityMapabogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapabogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras3.setOnClickListener {
            startActivity(Intent(this, BogotaInfo2::class.java))
        }
    }

}