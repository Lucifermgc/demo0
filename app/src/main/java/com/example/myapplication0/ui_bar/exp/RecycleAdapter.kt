package com.example.myapplication0.ui_bar.exp

import android.content.ClipData
import android.content.Intent
import android.graphics.ColorSpace
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication0.R

class RecycleAdapter(private val makeList: List<Make>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val TYPE_TOP = 0
    private val TYPE_BOTTOM = 1


    inner class FirstHolder(view:View) : RecyclerView.ViewHolder(view){
        val makeIt: TextView = view.findViewById(R.id.makeIt)
        val recycleIt : RecyclerView = view.findViewById(R.id.recyclerView2)
    }

    inner class SecondHolder(view:View) : RecyclerView.ViewHolder(view){
        val textIt: TextView = view.findViewById(R.id.textIt)
        val ImageIt : ImageView = view.findViewById(R.id.imageIt)
    }

    override fun getItemViewType(position: Int): Int {
        if (position==0){
            return TYPE_BOTTOM

        }else{
            return TYPE_TOP
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            TYPE_TOP ->{
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item,parent,false)
                return FirstHolder(view)
            }
            else ->{
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item3,parent,false)
                return SecondHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)  {
        val makeDs = makeList[position]

        when(holder){
            is FirstHolder ->{
                Log.d("okk2","$position")
                holder.makeIt.text = makeDs.name
                val layoutManager2 = LinearLayoutManager(holder.itemView.context)
                holder.recycleIt.layoutManager = layoutManager2
                layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
                val adapter2 = RecycleAdapter2(makeDs.doPicture)
                holder.recycleIt.adapter = adapter2
                Log.d("okk3","666")
            }
            is SecondHolder ->{

                holder.textIt.text =  makeDs.name2
                holder.ImageIt.setImageResource(makeDs.pictureId)
            }
        }




     //   initDoes1()
   //     val doPicture = listOf(Do(R.drawable.draw2),Do(R.drawable.draw3),Do(R.drawable.draw4),Do(R.drawable.draw5),Do(R.drawable.draw6),Do(R.drawable.draw7),Do(R.drawable.draw8))




    }

    override fun getItemCount() = makeList.size



}
class Make (val name:String ,val doPicture: List<Do>,val name2: String,val pictureId: Int){

}



