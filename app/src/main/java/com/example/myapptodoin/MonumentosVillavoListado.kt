package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosVillavoListadoBinding
import com.example.myapptodoin.model.MonumentoVisitarVillavo
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.QuerySnapshot

class MonumentosVillavoListado : AppCompatActivity() {
    private lateinit var bindin:ActivityMonumentosVillavoListadoBinding
    private var listam:MutableList<MonumentoVisitarVillavo> = mutableListOf()
    private lateinit var recycler:RecyclerView
    private lateinit var db:FirebaseFirestore
    private lateinit var am:AdaptadorMonumento
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindin=ActivityMonumentosVillavoListadoBinding.inflate(layoutInflater)
        setContentView(bindin.root)
        /* listam.add(MonumentoVisitarVillavo("Monumento a los Fundadores", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento Un sendero Hacia el Futuro", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento al Coleo", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento Cristo Rey", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento a Los Centauros", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento al Cenit", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento a la Cruz de la reconciliación", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento al Folclor Llanero", "Planea Y disfrutas Aquí"))
         listam.add(MonumentoVisitarVillavo("Monumento al Joropo", "Planea Y disfrutas Aquí"))*/

         //agregaradaptador()
        val intent=Intent(this,DetalleMonumento::class.java)
        db=FirebaseFirestore.getInstance();
        db.collection("monumentosvillavo").addSnapshotListener(object:EventListener<QuerySnapshot>{
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if (error!=null){
                    println("Error en Firebase")
                }


                    for(mon:DocumentChange in value?.documentChanges!!){
                        if(mon.type==DocumentChange.Type.ADDED){
                            listam.add(mon.document.toObject(MonumentoVisitarVillavo::class.java))
                            }
                    }
                am.notifyDataSetChanged()
                }
            })

        recycler=bindin.listarecycler
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        listam= mutableListOf()
        am=AdaptadorMonumento(this, listam!!,object:ClickListener{
            override fun OnClic(Vista: View, posicion: Int) {
                Toast.makeText(applicationContext, listam?.get(posicion)?.monumento, Toast.LENGTH_LONG).show()
                val mon=listam.get(posicion)?.monumento
                val des=listam.get(posicion)?.descripcion
                val ima=listam.get(posicion)?.imagen
                intent.putExtra("m",mon)
                intent.putExtra("d",des)
                intent.putExtra("i",ima)
                startActivity(intent)
            }
        })
        recycler.adapter=am
    }
    /*private fun agregaradaptador(){
        recycler=bindin.listarecycler
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=AdaptadorMonumento(this,listam)*/
    }



