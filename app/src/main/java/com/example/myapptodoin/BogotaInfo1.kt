package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotainfo1Binding
import com.example.myapptodoin.databinding.ActivityMainBinding

class BogotaInfo1: AppCompatActivity() {
    private lateinit var binding: ActivityBogotainfo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme((R.style.Theme_MyAppTODOIN))
        //Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityBogotainfo1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras7.setOnClickListener {
            startActivity(Intent(this, Login::class.java))

        }
        binding.btnmas.setOnClickListener {
            startActivity(Intent(this, BogotaInfo2::class.java))
        }
    }
}







