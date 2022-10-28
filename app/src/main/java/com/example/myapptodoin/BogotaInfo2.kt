package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotainfo1Binding
import com.example.myapptodoin.databinding.ActivityBogotainfo2Binding

class BogotaInfo2 : AppCompatActivity() {
    private lateinit var binding: ActivityBogotainfo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme((R.style.Theme_MyAppTODOIN))
        //Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityBogotainfo2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras6.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnbtnplanesbogota.setOnClickListener {
            startActivity(Intent(this, TodoInBogota::class.java))
        }
        binding.btnmapabogota.setOnClickListener {
            startActivity(Intent(this, MapaBogota::class.java))
        }
    }
}
