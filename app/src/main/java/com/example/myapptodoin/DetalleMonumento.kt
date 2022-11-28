package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapptodoin.databinding.ActivityDetalleMonumentoBinding

class DetalleMonumento : AppCompatActivity() {
    private lateinit var binding:ActivityDetalleMonumentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityDetalleMonumentoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val bundle=intent.extras
        val monumento=bundle?.getString("m")
        val descripcion=bundle?.getString("d")
        val imagen=bundle?.getString("i")

        binding.txtmonumentos.setText(monumento)
        binding.txtdescripcion.setText(descripcion)
        Glide.with(this).load(imagen).into(binding.imafoto)

    }
}
