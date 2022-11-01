package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityPopayaninfo1Binding
import com.example.myapptodoin.databinding.ActivityPopayaninfo2Binding

class PopayanInfo2 : AppCompatActivity() {
    private lateinit var binding: ActivityPopayaninfo2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPopayaninfo2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btndeatras5.setOnClickListener {
            startActivity(Intent(this, PopayanInfo1::class.java))
        }
        binding.planes.setOnClickListener {
            startActivity(Intent(this, MapaPopayan::class.java))
    }
        binding.btnplanesparahacerenpopayan.setOnClickListener {
            startActivity(Intent(this, TodoInPopayan::class.java))
}
}
}