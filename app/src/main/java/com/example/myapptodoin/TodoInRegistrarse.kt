package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.room.Room
import com.example.myapptodoin.data.UsuarioDB
import com.example.myapptodoin.databinding.ActivityTodoinregistrarseBinding
import com.example.myapptodoin.model.UsuarioModdel


class TodoInRegistrarse : AppCompatActivity() {
    private lateinit var binding: ActivityTodoinregistrarseBinding
    private lateinit var database:UsuarioDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database= Room.databaseBuilder(application,UsuarioDB::class.java,UsuarioDB.DATABASE_NAME).allowMainThreadQueries().build()
        binding = ActivityTodoinregistrarseBinding.inflate(layoutInflater)


        //val view = binding.root
        setContentView(binding.root)

        binding.btnregistrofoto.setOnClickListener {
            startActivity(Intent(this, FotoPerfil::class.java))
            Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()
        }

        binding.btnregistroregistrar.setOnClickListener {
            guardarconroom()
            //startActivity(Intent(this, Login::class.java))
        }
        binding.btnregistroinicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    fun guardarconroom() {
        val usuario = binding.boxusuario.text.toString()
        val correo = binding.boxcorreo.text.toString()
        val contrasena = binding.boxcontrasena.text.toString()
        val confcontrasena = binding.boxconfcontrasena.text.toString()
        val direccion = binding.boxdireccion.text.toString()
        val telefono = binding.boxtelefono.text.toString()
        val usu=UsuarioModdel(usuario,correo,contrasena,confcontrasena,direccion,telefono)
        database.usuarioDAO.insertar(usu)



    }
}
