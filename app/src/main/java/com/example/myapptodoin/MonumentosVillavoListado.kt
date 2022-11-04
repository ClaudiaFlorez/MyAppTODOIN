package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosVillavoListadoBinding

class MonumentosVillavoListado : AppCompatActivity() {
    private lateinit var bindin:ActivityMonumentosVillavoListadoBinding
    private var listam:MutableList<MonumentoVisitarVillavo> = mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindin=ActivityMonumentosVillavoListadoBinding.inflate(layoutInflater)
        setContentView(bindin.root)
        listam.add(MonumentoVisitarVillavo("Monumento a los Fundadores", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento Un sendero Hacia el Futuro", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento al Coleo", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento Cristo Rey", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento a Los Centauros", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento al Cenit", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento a la Cruz de la reconciliación", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento al Folclor Llanero", "Planea Y disfrutas Aquí"))
        listam.add(MonumentoVisitarVillavo("Monumento al Joropo", "Planea Y disfrutas Aquí"))
        agregaradaptador()
    }

    private fun agregaradaptador(){
        recycler=bindin.listarecycler
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=AdaptadorMonumento(this,listam)
    }

}