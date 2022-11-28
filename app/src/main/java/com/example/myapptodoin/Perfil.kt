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
            startActivity(Intent(this, TodoinPlanearYdisfrutar::class.java)) }

        binding.btnexit.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java)) }



        //obtenerdatos()
    }
    fun obtenerdatos() {
        val cajatxt = binding.txtdatosusu
        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val apellido = datos.getString("apellido", "")
        val correo = datos.getString("correo", "")
        val nombre = datos.getString("nombre", "")
        val telefono = datos.getString("telefono", "")
        cajatxt.setText("apellido: "+apellido+"\n"+"correo: "+correo+"\n"+"nombre: "+nombre+"\n"+"teléfono: "+telefono)
  }

    fun consultarperfil(id:String){
        db.collection("usuarios").document(id).get().addOnSuccessListener{
        binding.txtdatosusu.setText(it.get("nombre")as String? +" "+it.get("apellido") as String?+"\n "+it.get("correo") as String?+"\n "
                + "Celular: "+ it.get("teléfono")as String? )
        }

    }

}
