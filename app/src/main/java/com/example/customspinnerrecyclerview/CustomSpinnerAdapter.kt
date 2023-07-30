package com.example.customspinnerrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinnerAdapter (private val context: Context, private val cars:List<Car>) :BaseAdapter(){
    override fun getCount(): Int {
        return cars.size
    }

    override fun getItem(position: Int): Any {
        return cars[position]
    }

    override fun getItemId(position: Int): Long {
        return cars[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_spinner_layout, parent, false)

        val tvCarName=view.findViewById<TextView>(R.id.tvCarName)
        val ivCar =view.findViewById<ImageView>(R.id.ivCar)

        val cars=cars[position]

        tvCarName.text =context.getText(cars.carBrandModel)
        ivCar.setImageResource(cars.carLogo)

        return view
    }

}