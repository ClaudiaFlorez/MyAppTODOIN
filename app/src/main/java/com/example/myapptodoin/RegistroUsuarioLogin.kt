package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityRegistroUsuarioLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegistroUsuarioLogin : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroUsuarioLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityRegistroUsuarioLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        firebaseAuth=Firebase.auth
        binding.btnregistrar.setOnClickListener{
            if(binding.txtclave.text.toString().equals(binding.txtconfclave.text.toString())){
                if(binding.txtclave.length()>=6){
                    registrarUsuarioSesion(binding.txtusuario.text.toString(), binding.txtclave.text.toString())
                }
                else{
                    Toast.makeText(this,"La clave debe tener minimo 6 caracteres",Toast.LENGTH_LONG).show()
                }
            }
            else{
                Toast.makeText(this,"La claves deben ser iguales",Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun registrarUsuarioSesion(email:String,clave:String){
        if (email.isNotEmpty()&&clave.isNotEmpty()){
            firebaseAuth.createUserWithEmailAndPassword(email,clave).addOnCompleteListener(this){
                    task->
                if (task.isSuccessful){
                    Toast.makeText(this,"Datos guardados",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Sus datos no se guardaron",Toast.LENGTH_LONG).show()
                }
            }
        }
        else{

            Toast.makeText(this, "Los campos deben contener texto", Toast.LENGTH_LONG).show()
        }
    }
}
