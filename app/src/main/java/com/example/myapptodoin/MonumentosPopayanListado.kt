package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.ActivityMonumentosPopayanListadoBinding
import com.example.myapptodoin.model.MonumentosVisitarPopayan
import com.google.firebase.firestore.DocumentChange
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.QuerySnapshot

class MonumentosPopayanListado : AppCompatActivity() {
    private lateinit var bindin:ActivityMonumentosPopayanListadoBinding
    private var list:MutableList<MonumentosVisitarPopayan> = mutableListOf()
    private lateinit var recycler:RecyclerView
    private lateinit var db:FirebaseFirestore
    private lateinit var am:AdaptadorMonumentosPopayan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindin=ActivityMonumentosPopayanListadoBinding.inflate(layoutInflater)
        setContentView(bindin.root)

        val intent=Intent(this,DetalleMonumento::class.java)
        db=FirebaseFirestore.getInstance();
        db.collection("monumentospopayan").addSnapshotListener(object:EventListener<QuerySnapshot>{
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if (error!=null){
                    println("Error en Firebase")
                }


                for(mon:DocumentChange in value?.documentChanges!!){
                    if(mon.type==DocumentChange.Type.ADDED){
                        list.add(mon.document.toObject(MonumentosVisitarPopayan::class.java))
                    }
                }
                am.notifyDataSetChanged()
            }
        })

        recycler=bindin.listapopa
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        list= mutableListOf()
        am=AdaptadorMonumentosPopayan(this, list!!,object:ClickListener{
            override fun OnClic(Vista: View, posicion: Int) {
                Toast.makeText(applicationContext, list?.get(posicion)?.monumento, Toast.LENGTH_LONG).show()
                val mon=list.get(posicion)?.monumento
                val des=list.get(posicion)?.descripcion
                val ima=list.get(posicion)?.imagen
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