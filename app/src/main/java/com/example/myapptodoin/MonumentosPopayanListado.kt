package com.example.myapptodoin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosBogListadoBinding
import com.example.myapptodoin.databinding.ActivityMonumentosPopayanBinding
import com.example.myapptodoin.databinding.ActivityMonumentosPopayanListadoBinding


class MonumentosPopayanListado : AppCompatActivity() {
    private lateinit var binding: ActivityMonumentosPopayanListadoBinding
    private var list:MutableList<MonumentoVisitarPopayan> = mutableListOf()
    private lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMonumentosPopayanListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","Calle del reloj: lugar de peregrinación desde la colonia, constituye un atractivo natural, religioso y gastronómico."))
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","La Ermita de Popayán: es una iglesia católica tipo ermita ubicada en el Centro histórico de Popayán sobre una parte de la Calle 5 (llamada antiguamente como Calle Real de las Catedrales o de La Ermita)."))
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","Palacio Arzobispal: El Palacio Arzobispal fue diseñado en estilo ecléctico neocolonial y neobarroco por Jesús María Plaza y construido entre 1930 y 1934. "))
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","Mirador el morro: El Morro del Tulcán o Pirámide de Tucán es el principal sitio arqueológico de Popayán. Este consiste en una pequeña loma no natural en forma de pirámide truncada."))
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","Teatro Municipal: Principal escenario de la cultura del Cauca declarado Monumento Nacional."))
        list.add(MonumentoVisitarPopayan("Planea Y disfruta Aquí","Parque Caldas: Es uno de los sitios más antiguos de la ciudad, construido aproximadamente en el año 1537 como plaza de mercado el cual se ha transformado a través de los años."))

        agregaradaptador()
    }

    private fun agregaradaptador(){

        recycler=binding.listapopa
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=AdaptadorMonumentosPopayan(this,list)
    }


}