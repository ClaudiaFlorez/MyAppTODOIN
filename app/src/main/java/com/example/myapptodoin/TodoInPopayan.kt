package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityTodoInPopayanBinding

class TodoInPopayan : AppCompatActivity() {
    private lateinit var binding: ActivityTodoInPopayanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_in_popayan)
        binding = ActivityTodoInPopayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnmonupo.setOnClickListener {
            startActivity(Intent(this, MonumentosPopayan::class.java))
        }
        binding.btncamipopa.setOnClickListener {
            startActivity(Intent(this, CaminatasPopayan::class.java))
        }
        binding.btntourspopa.setOnClickListener {
            startActivity(Intent(this, ToursPopayan::class.java))

        }
        binding.btncpopa.setOnClickListener {
            startActivity(Intent(this, CampingPopayan::class.java))
        }

        binding.btniniciotodoin.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }
    }
}