package com.example.myapplication0.ui_bar.exp

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication0.R

class RecycleAdapter2(private val doPicture : List<Do>) : RecyclerView.Adapter<RecycleAdapter2.ViewHolder>(){
    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
        val doIt: ImageView = view.findViewById(R.id.doIt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item2,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doDs = doPicture[position]
        Log.d("okk","$position")
        holder.doIt.setImageResource(doDs.imageId)
        holder.itemView.setOnClickListener {
            val position = holder.bindingAdapterPosition
            val doDs = doPicture[position]
            Toast.makeText(holder.itemView.context,"you clicked ${doDs.imageId}",Toast.LENGTH_SHORT).show()
            Log.d("ok","$position")
        }




    }

    override fun getItemCount() = doPicture.size
}

class Do (val imageId: Int){

}