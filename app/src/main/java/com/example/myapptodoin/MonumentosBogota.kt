package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo2Binding
import com.example.myapptodoin.databinding.ActivityMonumentosbogotaBinding

class MonumentosBogota : AppCompatActivity() {
    private lateinit var binding: ActivityMonumentosbogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonumentosbogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnplanea.setOnClickListener {
            startActivity(Intent(this, BogotaRegistro::class.java))
        }
        binding.btnatras2.setOnClickListener {
            startActivity(Intent(this, TodoInBogota::class.java))
        }
    }
}
