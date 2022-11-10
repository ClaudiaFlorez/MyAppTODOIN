package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapptodoin.databinding.ActivityRecuperarClaveBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RecuperarClave : AppCompatActivity() {
    private lateinit var binding: ActivityRecuperarClaveBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecuperarClaveBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        firebaseAuth = Firebase.auth
        binding.btnrecuperarclave.setOnClickListener {
            recuperarclave(binding.txtcorreorecupera.text.toString())

        }
    }

    private fun recuperarclave(email: String) {
        firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener() { task ->
            if (task.isSuccessful) {
                Toast.makeText(this, "El correo de recuperación fue enviado", Toast.LENGTH_LONG)
                    .show()
            } else {
                Toast.makeText(this, "No fue posible enviar el correo", Toast.LENGTH_LONG).show()
            }
        }
    }
}


