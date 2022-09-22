package com.example.myapplication0.ui_bar.exp

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication0.R

class RecycleAdapter(private val makeList : List<Make>) : RecyclerView.Adapter<RecycleAdapter.ViewHolder>(){



    inner class ViewHolder(view:View) : RecyclerView.ViewHolder(view){
        val makeIt: TextView = view.findViewById(R.id.makeIt)
        val recycleIt : RecyclerView = view.findViewById(R.id.recyclerView2)
        val recycleIt2 : RecyclerView = view.findViewById(R.id.recyclerView3)
        val recycleIt3 : RecyclerView = view.findViewById(R.id.recyclerView4)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  {
        val makeDs = makeList[position]
        Log.d("okk2","$position")
        holder.makeIt.text = makeDs.name

     //   initDoes1()
        val doPicture = listOf(Do(R.drawable.draw2),Do(R.drawable.draw3),Do(R.drawable.draw4),Do(R.drawable.draw5),Do(R.drawable.draw6),Do(R.drawable.draw7),Do(R.drawable.draw8))
        val layoutManager2 = LinearLayoutManager(holder.itemView.context)
        holder.recycleIt.layoutManager = layoutManager2
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
        val adapter2 = RecycleAdapter2(doPicture)
        holder.recycleIt.adapter = adapter2
        Log.d("okk3","666")

        val doPicture2 = listOf(Do(R.drawable.draw3),Do(R.drawable.draw4),Do(R.drawable.draw5),Do(R.drawable.draw6),Do(R.drawable.draw7),Do(R.drawable.draw8),Do(R.drawable.draw9))
        val layoutManager3 = LinearLayoutManager(holder.itemView.context)
        holder.recycleIt2.layoutManager = layoutManager3
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL
        val adapter3 = RecycleAdapter3(doPicture2)
        holder.recycleIt2.adapter = adapter3

        val doPicture3 = listOf(Do(R.drawable.draw4),Do(R.drawable.draw5),Do(R.drawable.draw6),Do(R.drawable.draw7),Do(R.drawable.draw8),Do(R.drawable.draw9),Do(R.drawable.draw10))
        val layoutManager4 = LinearLayoutManager(holder.itemView.context)
        holder.recycleIt3.layoutManager = layoutManager4
        layoutManager4.orientation = LinearLayoutManager.HORIZONTAL
        val adapter4 = RecycleAdapter4(doPicture3)
        holder.recycleIt3.adapter = adapter4

    }



    override fun getItemCount() = makeList.size


/*

    private fun initDoes1(){
        doPicture.add(Do(R.drawable.draw2))
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
        doPicture.add(Do(R.drawable.draw8))
    }*/
}

class Make (val name:String){

}
