package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityLoginBinding
import com.example.myapptodoin.databinding.ActivityMainBinding


class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding  //para que un usuario x se pueda loguear
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnloginingresar.setOnClickListener {
            validar()
            //startActivity(Intent(this, Perfil::class.java))

        }
        binding.recuperarcontrasenatxt.setOnClickListener {
            startActivity(Intent(this, Recuperarcontrasena::class.java))
        }
    }

    fun validar() {
        val usuario = binding.txtusuario.text.toString()
        val clave = binding.txtcontrasena.text.toString()
        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val usu = datos.getString("USUARIO", "")
        val cla = datos.getString("CONTRASENA", "")

        if (usuario.isEmpty()) {
            binding.txtusuario.setHint("Ingresar Usuario")
            }
        else if (clave.isEmpty()){
            binding.txtcontrasena.setHint("Digite la Clave")
            binding.txtcontrasena.setHintTextColor(Color.RED)
        }
        else if (usuario.equals(usu) && clave.equals(cla)) {
            Toast.makeText(this, "Datos correctos", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Perfil::class.java))
        }
        else{
            Toast.makeText(this, "Clave o Usuario incorrectos",Toast.LENGTH_LONG).show()
        }
    }
}







