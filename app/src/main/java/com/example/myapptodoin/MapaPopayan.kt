package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMapapopayanBinding
import com.example.myapptodoin.databinding.ActivityMapavillavoBinding

class MapaPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityMapapopayanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapapopayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras3.setOnClickListener {
            startActivity(Intent(this, PopayanInfo2::class.java))

    }
}
}