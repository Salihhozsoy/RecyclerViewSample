package com.example.customspinnerrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarsActivity : AppCompatActivity() {

    val cars2 = listOf(
        Car2(1, "AUDI A5", R.drawable.audia5),
        Car2(1, "AUDI A8", R.drawable.audia8),
        Car2(1, "MERCEDES E200D", R.drawable.e200d),
        Car2(1, "FORD FOCUS", R.drawable.focus),
        Car2(1, "BMW M4", R.drawable.m4),
        Car2(1, "MERCEDES E200D", R.drawable.e200d),
    )
    lateinit var rvCars: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)

        rvCars = findViewById(R.id.rvCars)
        rvCars.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvCars.adapter = CarAdapter(this, cars2)
    }
}