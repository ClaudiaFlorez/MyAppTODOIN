package com.example.myapptodoin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosBogListadoBinding
import com.example.myapptodoin.model.MonumentoVisitarBogota
import com.google.firebase.firestore.*

class MonumentosBogListado : AppCompatActivity() {
    private lateinit var bindin: ActivityMonumentosBogListadoBinding
    private var listam:MutableList<MonumentoVisitarBogota> = mutableListOf()
    private lateinit var recycler:RecyclerView
    private lateinit var db:FirebaseFirestore
    private lateinit var am:AdaptadorMonumentoBogota
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindin= ActivityMonumentosBogListadoBinding.inflate(layoutInflater)
        setContentView(bindin.root)
        /*list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","MONSERRATE: lugar de peregrinación desde la colonia, constituye un atractivo natural, religioso y gastronómico."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","GUADALUPE: el cerro es uno de los más notables de Bogotá, ubicado entre la ciudad y el páramo de Cruz Verde."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CASA NARIÑO: es la residencia oficial y principal sede de trabajo del Presidente. Se ubica en el centro histórico de Bogotá. "))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CAPITOLIO NACIONAL: sede del Congreso, máximo órgano legislativo de Colombia. Está ubicado al sur de la Plaza de Bolívar."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","MONUMENTO A LOS HEROES: dedicado a la memoria de los soldados caídos en la independencia por los países bolivarianos."))
        list.add(MonumentoVisitarBogota("Planea Y disfruta Aquí","CEMENTERIO CENTRAL: es más antiguo de la ciudad. Ubicado en el barrio Santa Fe. Declarado monumento nacional en 1984. "))

        agregaradaptador()*/
        db= FirebaseFirestore.getInstance();
        db.collection("MonumentosVisitarBogota").addSnapshotListener(object: EventListener<QuerySnapshot> {
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if (error!=null){
                    println("Error en Firebase")
                }

                for(mon: DocumentChange in value?.documentChanges!!){
                    if(mon.type== DocumentChange.Type.ADDED){
                        listam.add(mon.document.toObject(MonumentoVisitarBogota::class.java))
                    }
                }
                am.notifyDataSetChanged()
            }
        })

        recycler=bindin.ListMonumentosBog
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        listam= mutableListOf()
        am=AdaptadorMonumentoBogota(this, listam,object:ClickListener{
            override fun OnClic(Vista: View, posicion: Int) {

            }

        })
        recycler.adapter=am
    }

   /* private fun agregaradaptador(){
        recycler=bindin.listarecycler
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=AdaptadorMonumento(this,listam)*/


    }



