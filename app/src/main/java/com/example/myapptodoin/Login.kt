package com.example.myapptodoin

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.CallStateListener
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityLoginBinding
import com.example.myapptodoin.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding  //para que un usuario x se pueda loguear
    private lateinit var firebaseauth:FirebaseAuth
    private lateinit var authStateListener:FirebaseAuth.AuthStateListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        firebaseauth=Firebase.auth


        binding.btnloginingresar.setOnClickListener {


            login(binding.txtusuario.text.toString(),binding.txtcontrasena.text.toString())


        }
        binding.txtrecuperarclave.setOnClickListener {
            startActivity(Intent(this, RecuperarClave::class.java))
        }
        binding.btnlogininicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnlogininicio.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        }
    fun validar() {
        val usuario = binding.txtusuario.text.toString()
        val contrasena = binding.txtcontrasena.text.toString()
        val datos = getSharedPreferences("bdusuario", Context.MODE_PRIVATE)
        val usu = datos.getString("usuario", "")
        val cont = datos.getString("contrasena", "")
        Toast.makeText(this, "validado", Toast.LENGTH_LONG).show()

        if(usuario.isEmpty()) {
            binding.txtusuario.setHint("Ingresar el Usuario")
        }
        else if(contrasena.isEmpty()){
            binding.txtcontrasena.setHint("Ingrese la contraseña")
            binding.txtcontrasena.setHintTextColor(Color.RED)
        }
        else if (usuario.equals(usu)&&contrasena.equals(cont)){
            Toast.makeText(this, "Datos correctos", Toast.LENGTH_LONG).show()
            startActivity(Intent(this,Perfil::class.java))
        }
        else{
            Toast.makeText(this, "Sus datos no son correctos", Toast.LENGTH_LONG).show()
        }
    }


    private fun login(email:String, password:String){
        firebaseauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this){task->

          if (task.isSuccessful){
              Toast.makeText(this,"Datos correctos",Toast.LENGTH_LONG).show()
              startActivity(Intent(this,TodoInRegistrarse::class.java))
          }
        else{
              Toast.makeText(this,"El usuario no se encontró",Toast.LENGTH_LONG).show()
        }
        }

    }


}







