package com.example.customspinnerrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val context: Context, private val cars: List<Car2>) : RecyclerView.Adapter<CarAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.car_list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val cars = cars[position]
        holder.ivCarr.setImageResource(cars.carLogoo)
        holder.tvCarFullName.text = "${cars.carBrandModell}"
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivCarr: ImageView = itemView.findViewById(R.id.ivCarr)
        val tvCarFullName: TextView = itemView.findViewById(R.id.tvCarFullName)
    }
}