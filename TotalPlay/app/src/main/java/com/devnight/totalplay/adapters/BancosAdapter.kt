package com.devnight.totalplay.adapters

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.devnight.totalplay.R
import com.devnight.totalplay.domain.models.Models

class BancosAdapter(val context: Context, val list: List<Models.ModelReferencias>): RecyclerView.Adapter<BancosAdapter.ViewHolder>() {


    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {

        val itemImage = item.findViewById<ImageView>(R.id.image)
        val reference = item.findViewById<TextView>(R.id.reference)


        fun render(item: Models.ModelReferencias, context: Context){

            Glide.with(context).load(item.images[0].url3X3).into(itemImage)
            reference.setText(item.reference)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.bancos_adapter, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.render(list[position], context)
    }
    override fun getItemCount(): Int = list.size
}