package com.example.customspinnerrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

   private val cars = listOf(
        Car(1, R.string.AudiA5, R.drawable.audia5),
        Car(2, R.string.AudiA8, R.drawable.audia8),
        Car(3, R.string.MercedesE200D, R.drawable.e200d),
        Car(4, R.string.BMWM4, R.drawable.m4),
        Car(5, R.string.FORDFOCUS, R.drawable.focus)
    )

    lateinit var spCars: Spinner
    lateinit var btnGoCarsPage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spCars = findViewById(R.id.spCars)
        spCars.adapter = CustomSpinnerAdapter(this, cars)


        btnGoCarsPage = findViewById(R.id.btnGoCarsPage)
        btnGoCarsPage.setOnClickListener {
            val intent = Intent(this, FruitActivity::class.java)
            startActivity(intent)
        }
    }
}