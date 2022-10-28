package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityTodoinregistrarseBinding

class TodoInRegistrarse : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinregistrarseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinregistrarseBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnregistroregistrar.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()

        }
        binding.btnregistroinicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}

    /*
         }*/

    /* binding.btnregistrofoto.setOnClickListener {
 startActivity(Intent(this, Camera::class.java))

}*/



