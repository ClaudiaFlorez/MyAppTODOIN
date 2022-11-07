package com.example.myapptodoin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorMonumento (private val context: Context, val lista: MutableList<MonumentoVisitarVillavo>):
    RecyclerView.Adapter<AdaptadorMonumento.ViewHolder>(){
    inner class ViewHolder(itemsview:View):RecyclerView.ViewHolder(itemsview){
        lateinit var datosview: TextView
        init {
            datosview=itemsview.findViewById(R.id.textusuario)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.cardmonumentosvillavo,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val positionmonumento=lista[position]
        holder.datosview.text=positionmonumento.nombre
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}

//Comentarios
//Es una clase que me permite reconocer todos los textview que voy a generar en mi aplicación
//Los Recyclerview son listas gráficas donde van datos (contactos en el celular)