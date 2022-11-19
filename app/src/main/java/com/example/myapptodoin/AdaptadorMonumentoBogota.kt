package com.example.myapptodoin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptodoin.databinding.MonumentoAVisitarBogotaBinding
import com.example.myapptodoin.model.MonumentoVisitarBogota

class AdaptadorMonumentoBogota(private val context: Context, val list:MutableList<MonumentoVisitarBogota>, var clickListener: ClickListener):
    RecyclerView.Adapter<AdaptadorMonumentoBogota.ViewHolder>(){
    inner class ViewHolder(itemsview:View,listener: ClickListener):RecyclerView.ViewHolder(itemsview), View.OnClickListener{

            lateinit var datosview: TextView
            var listener: ClickListener? = null
            init {
                datosview = itemsview.findViewById(R.id.textusuario)
                //this.listener=listener
                itemsview.setOnClickListener(this)
            }
        override fun onClick(v: View?) {
                this.listener?.OnClic(v!!, adapterPosition)
            }
        }
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): AdaptadorMonumentoBogota.ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.monumento_a_visitar_bogota, parent, false)
            return ViewHolder(view, clickListener)
    }

        override fun onBindViewHolder(holder: AdaptadorMonumentoBogota.ViewHolder, position: Int) {
        val positionmonumento=list[position]
        holder.datosview.text=positionmonumento.nombre
}

        override fun getItemCount(): Int {
        return list.size
}
}



//Comentarios
//Es una clase que me permite reconocer todos los textview que voy a generar en mi aplicación
//Los Recyclerview son listas gráficas donde van datos (contactos en el celular)