package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityTodoInRegistrarseBinding


class TodoInRegistrarse : AppCompatActivity() {
    private lateinit var binding: ActivityTodoInRegistrarseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTodoInRegistrarseBinding.inflate(layoutInflater)

        //val view = binding.root
        setContentView(binding.root)

        binding.btnregistrofoto.setOnClickListener {
            startActivity(Intent(this, FotoPerfil::class.java))
            Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()
        }

        binding.btnregistroregistrar.setOnClickListener {
            guardar()
            //startActivity(Intent(this, Login::class.java))
        }
        binding.btnregistroinicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    fun guardar() {
        val usuario = binding.boxusuario.text.toString()
        val correo = binding.boxcorreo.text.toString()
        val contrasena = binding.boxcontrasena.text.toString()
        val confcontrasena = binding.boxconfcontrasena.text.toString()
        val direccion = binding.boxdireccion.text.toString()
        val telefono = binding.boxtelefono.text.toString()
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
