package com.example.mediumrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class RecyclerviewAdapter(var tourList: ArrayList<Tour>) : RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int =tourList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.tourName.text=tourList[position].name
        holder.photo.setImageResource(tourList[position].photo)
        holder.cost.text= tourList[position].cost
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {

       val tourName=view.findViewById<TextView>(R.id.title_tv)
        val photo=view.findViewById<ImageView>(R.id.imagev)
        val cost=view.findViewById<TextView>(R.id.cost)
    }

}

