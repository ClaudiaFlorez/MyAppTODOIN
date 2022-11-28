package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosBogListadoBinding
import com.example.myapptodoin.model.MonumentoVisitarBogota
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.QuerySnapshot

class MonumentosBogListado : AppCompatActivity() {
    private lateinit var bindin:ActivityMonumentosBogListadoBinding
    private var listam:MutableList<MonumentoVisitarBogota> = mutableListOf()
    private lateinit var recycler:RecyclerView
    private lateinit var db:FirebaseFirestore
    private lateinit var am:AdaptadorMonumentoBogota
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindin=ActivityMonumentosBogListadoBinding.inflate(layoutInflater)
        setContentView(bindin.root)

        val intent=Intent(this,DetalleMonumento::class.java)
        db=FirebaseFirestore.getInstance();
        db.collection("monumentosbogota").addSnapshotListener(object:EventListener<QuerySnapshot>{
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if (error!=null){
                    println("Error en Firebase")
                }


                for(mon:DocumentChange in value?.documentChanges!!){
                    if(mon.type==DocumentChange.Type.ADDED){
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
        am=AdaptadorMonumentoBogota(this, listam!!,object:ClickListener{
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