package com.example.myapptodoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosBogListadoBinding

class MonumentosBogListado : AppCompatActivity() {
    private lateinit var binding: ActivityMonumentosBogListadoBinding
    private var list:MutableList<MonumentoVisitarBogota> = mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMonumentosBogListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","MONSERRATE: lugar de peregrinación desde la colonia, constituye un atractivo natural, religioso y gastronómico."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","GUADALUPE: el cerro es uno de los más notables de Bogotá, ubicado entre la ciudad y el páramo de Cruz Verde."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CASA NARIÑO: es la residencia oficial y principal sede de trabajo del Presidente. Se ubica en el centro histórico de Bogotá. "))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CAPITOLIO NACIONAL: sede del Congreso, máximo órgano legislativo de Colombia. Está ubicado al sur de la Plaza de Bolívar."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","MONUMENTO A LOS HEROES: dedicado a la memoria de los soldados caídos en la independencia por los países bolivarianos."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CEMENTERIO CENTRAL: es más antiguo de la ciudad. Ubicado en el barrio Santa Fe. Declarado monumento nacional en 1984. "))

        agregaradaptador()
    }
    private fun agregaradaptador(){

        recycler=binding.ListMonumentosBog
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=AdaptadorMonumentosBogota(this,list)
    }
}