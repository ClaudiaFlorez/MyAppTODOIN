package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo1Binding
import com.example.myapptodoin.databinding.ActivityTodoinbogotaBinding

class TodoInBogota : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinbogotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinbogotaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmonumentosbogota.setOnClickListener {
            startActivity(Intent(this, MonumentosBogota::class.java))
        }
        binding.btncaminatasbogota.setOnClickListener {
            startActivity(Intent(this, CaminatasBogota::class.java))
        }
        binding.btntoursbogota.setOnClickListener {
            startActivity(Intent(this, ToursBogota::class.java))

        }
        binding.btncampingbogota.setOnClickListener {
            startActivity(Intent(this, CampingBogota::class.java))
        }

        binding.btnatrasbogota.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }
    }
}
