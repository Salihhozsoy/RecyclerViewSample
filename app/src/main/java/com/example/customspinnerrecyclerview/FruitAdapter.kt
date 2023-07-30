package com.example.customspinnerrecyclerview

import android.content.ClipData.Item
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView



class FruitAdapter (private val context: Context, private val fruits:List<String>) :RecyclerView.Adapter<FruitAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val tvFruitName:TextView=itemview.findViewById(R.id.tvFruitName)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitAdapter.CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fruit_list_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: FruitAdapter.CustomViewHolder, position: Int) {
        val fruits=fruits[position]
        holder.tvFruitName.text = fruits
    }

    override fun getItemCount(): Int {
      return  fruits.size
    }
}