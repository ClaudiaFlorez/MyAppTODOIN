package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((R.style.Theme_MyAppTODOIN))
        Thread.sleep(2000)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnbogota.setOnClickListener {
            startActivity(Intent(this, BogotaRegistro::class.java))
            Toast.makeText(this, "click en el botón Bogota", Toast.LENGTH_LONG).show()

        }
        binding.btnvillavo.setOnClickListener {
            startActivity(Intent(this, VillavoRegistro::class.java))
            }

        binding.btnpopayan.setOnClickListener{
            startActivity(Intent(this,PopayanRegistro::class.java))
        }

        binding.btnsomos.setOnClickListener {
            startActivity(Intent(this, TodoInSomos::class.java))
            }
        binding.btningresar.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
}
        binding.btnregistrarse.setOnClickListener {
            startActivity(Intent(this, RegistroUsuarioLogin::class.java))


        }


        }
    }

