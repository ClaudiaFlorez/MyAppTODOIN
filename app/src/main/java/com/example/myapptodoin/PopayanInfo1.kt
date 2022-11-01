package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityBogotaInfo1Binding
import com.example.myapptodoin.databinding.ActivityPopayaninfo1Binding

class PopayanInfo1 : AppCompatActivity() {
    private lateinit var binding: ActivityPopayaninfo1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopayaninfo1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras4.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }
        binding.mas7.setOnClickListener {
            startActivity(Intent(this, PopayanInfo2::class.java))

        }
    }
}