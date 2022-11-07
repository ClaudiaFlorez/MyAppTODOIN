package com.example.myapptodoin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class AdaptadorMonumentosPopayan(private val context: Context, val list: MutableList<MonumentosVisitarPopayan>):

    RecyclerView.Adapter<AdaptadorMonumentosPopayan.ViewHolder>() {
    inner class ViewHolder(itemsview: View) : RecyclerView.ViewHolder(itemsview) {
        lateinit var datosview: TextView

        init {
            datosview = itemsview.findViewById(R.id.txtmonumento)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.monumento_a_visitar_bogota, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val monumento1 = list[position]
        holder.datosview.text = monumento1.nombre
        holder.datosview.text = monumento1.planear
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
