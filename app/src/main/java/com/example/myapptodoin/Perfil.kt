package com.example.myapptodoin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.ViewBinding
import com.example.myapptodoin.databinding.ActivityFotoPerfilBinding
import com.example.myapptodoin.databinding.ActivityMainBinding
import com.example.myapptodoin.databinding.ActivityPerfilBinding

class Perfil : AppCompatActivity() {
    private  lateinit var binding:ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityPerfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    fun obtenerdartos(){
        val cajatxt=binding.textViewnombre
        val datos=getSharedPreferences("dbusuario",Context.MODE_PRIVATE)
        val nombre=datos.getString("usuario","")
        cajatxt.setText(nombre)

    }
}