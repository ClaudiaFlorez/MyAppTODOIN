package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapptodoin.databinding.ActivityPerfilBinding
import com.google.firebase.firestore.FirebaseFirestore
class Perfil : AppCompatActivity() {
    private lateinit var binding: ActivityPerfilBinding
    private val db=FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle=intent.extras
        val dato=bundle?.getString("ide")
        consultarperfil(dato?:"")

        binding.btnperfilplanea.setOnClickListener {
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java))
        }

        binding.btnexit.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
        //obtenerdatos()
    binding.btnperfilplanea.setOnClickListener{
        startActivity(Intent(this, MonumentosVillavoListado::class.java))
    }
    }
    fun obtenerdatos() {
        val cajatxt = binding.txtdatosusu
        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val nombrecompleto = datos.getString("nombrecopleto", "")
        val usuario = datos.getString("usuario", "")
        val correo = datos.getString("correo", "")
        val direccion = datos.getString("direccion", "")
        val telefono = datos.getString("telefono", "")
        cajatxt.setText("Nombre Completo: "+nombrecompleto+"\n"+"Usuario: "+usuario+"\n"+"Correo: "+correo+"\n"+"Dirección: "+direccion+"\n"+"Teléfono: "+telefono)

    }
    fun consultarperfil(id:String){
        db.collection("usuarios").document(id).get().addOnSuccessListener{
        binding.txtdatosusu.setText(it.get("Nombre Completo")as String? +"\n " +it.get("Usuario") as String?+"\n "
                +it.get("Correo") as String?+"\n "+ it.get("Teléfono")as String? )
        }
    }
}
