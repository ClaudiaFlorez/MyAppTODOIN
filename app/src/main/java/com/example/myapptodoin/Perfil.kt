package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityCaminatasvillavoBinding
import com.example.myapptodoin.databinding.ActivityPerfilBinding
import com.example.myapptodoin.databinding.ActivityTodoinvillavoBinding

class Perfil : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnperfilplanea.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }

        binding.btnexit.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))


        }

        obtenerdatos()

    }

    fun obtenerdatos() {
        val cajatxt = binding.txtdatosusu

        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val usuario = datos.getString("usuario", "")
        val correo = datos.getString("correo", "")
        val direccion = datos.getString("direccion", "")
        val telefono = datos.getString("telefono", "")
        cajatxt.setText("Usuario: "+usuario+"\n"+"Correo: "+correo+"\n"+"Dirección: "+direccion+"\n"+"Teléfono: "+telefono)




    }
}
