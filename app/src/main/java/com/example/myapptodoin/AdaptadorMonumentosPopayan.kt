package com.example.myapptodoin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapptodoin.model.MonumentosVisitarPopayan

class AdaptadorMonumentosPopayan (private val context: Context, val list: MutableList<MonumentosVisitarPopayan>, var clickListener: ClickListener):
    RecyclerView.Adapter<AdaptadorMonumentosPopayan.ViewHolder>(){
    inner class ViewHolder(itemsview:View,listener: ClickListener):RecyclerView.ViewHolder(itemsview), View.OnClickListener{
        var datosview: TextView
        var datosimagen:ImageView

        var listener:ClickListener?=null

        init {
            datosview=itemsview.findViewById(R.id.textusuario)
            datosimagen=itemsview.findViewById(R.id.imgusuario)
            this.listener=listener
            itemsview.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            this.listener?.OnClic(v!!,adapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.cardmonumentospopayan,parent,false)
        return ViewHolder(view,clickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val positionmonumento=list[position]
        holder.datosview.text=positionmonumento.monumento
        Glide.with(holder.itemView).load(positionmonumento.imagen).into(holder.datosimagen)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}