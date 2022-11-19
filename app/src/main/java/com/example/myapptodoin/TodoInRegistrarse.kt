package com.example.myapptodoin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapptodoin.data.UsuarioDB
import com.example.myapptodoin.databinding.ActivityTodoInRegistrarseBinding
import com.google.firebase.firestore.FirebaseFirestore


class TodoInRegistrarse : AppCompatActivity() {
    private lateinit var binding: ActivityTodoInRegistrarseBinding
    private lateinit var database: UsuarioDB
    private val db = FirebaseFirestore.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //database = Room.databaseBuilder(application, UsuarioDB::class.java, UsuarioDB.DATABASE_NAME).allowMainThreadQueries().build()
        binding = ActivityTodoInRegistrarseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras
        val email: String? = bundle?.getString("email")
        binding.boxcorreo.setText(email)

        binding.btnregistrofoto.setOnClickListener {
            //Toast.makeText(this, "click en el botón Registrar", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, FotoPerfil::class.java))
        }

        binding.btnregistroregistrar.setOnClickListener {

            val bundle = intent.extras
            val datoid: String? = bundle?.getString("id")
            guardardatosfirestore(datoid?: "")
            Toast.makeText(this, "DATOS GUARDADOS", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Login::class.java))
            // guardarconroom()

        }
    }

    /*fun guardarconroom() {
        val usuario = binding.boxusuario.text.toString()
        val correo = binding.boxcorreo.text.toString()
        val contrasena = binding.boxcontrasena.text.toString()
        val confcontrasena = binding.boxconfcontrasena.text.toString()
        val nombrecompleto = binding.boxnombrecompleto.text.toString()
        val telefono = binding.boxtelefono.text.toString()
        val usu = UsuarioModdel(usuario, correo, contrasena, confcontrasena, nombrecompleto, telefono)
        database.usuarioDAO.insertar(usu)
    }}*/
    private fun guardardatosfirestore(datoid:String){
        db.collection("usuarios").document(datoid).set(
            hashMapOf("Nombre" to binding.boxnombre.text.toString(),"Apellido" to binding.boxapellido.text.toString(),
                "Correo" to binding.boxcorreo.text.toString(), "Teléfono" to binding.boxtelefono.text.toString()))

    }

    }

