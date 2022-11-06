package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityTodoinregistrarseBinding
import android.widget.TextView
import com.example.myapptodoin.databinding.ActivityTodoinRegistrarseBinding


class TodoInRegistrarse : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinRegistrarseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTodoinRegistrarseBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnregistroregistrar.setOnClickListener {
            guardar()
            //startActivity(Intent(this, Login::class.java))
        }
        binding.btnregistroinicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnregistrofoto.setOnClickListener {
            startActivity(Intent(this, FotoPerfil::class.java))
            Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()
        }
    }

    fun guardar() {
        val usuario = binding.usuario.toString()
        val correo = binding.correo.toString()
        val contrasena = binding.contrasena.toString()
        val confcontrasena = binding.confcontrasena.toString()
        val direccion = binding.ciudad2.toString()
        val telefono = binding.telefono.toString()
        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val editor = datos.edit()
        editor.putString("usuario", usuario)
        editor.putString("correo", correo)
        editor.putString("contrasena", contrasena)
        editor.putString("confcontrasena", confcontrasena)
        editor.putString("direccion", direccion)
        editor.putString("telefono", telefono)
        editor.commit()
        Toast.makeText(this, "Datos Guardados", Toast.LENGTH_LONG).show()

    }
}