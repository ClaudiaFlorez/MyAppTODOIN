package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityMainBinding
import com.example.myapptodoin.databinding.ActivityTodoinPlanearYdisfrutarBinding

class TodoinPlanearYdisfrutar : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinPlanearYdisfrutarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((R.style.Theme_MyAppTODOIN))
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinPlanearYdisfrutarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnvillavo1.setOnClickListener {
            startActivity(Intent(this, VillavoInfo1::class.java))
        }
        binding.btnbogota1.setOnClickListener {
            startActivity(Intent(this, BogotaInfo1::class.java))
        }

        binding.btnpopayan1.setOnClickListener {
            startActivity(Intent(this, PopayanInfo1::class.java))
        }

        }

    }


