package com.example.customspinnerrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class FruitActivity : AppCompatActivity() {

    private val fruits = mutableListOf("apple","pear","banana","pineapple","cherry")


    lateinit var rvFruits: RecyclerView
    lateinit var btnInsert: Button
    lateinit var btnRemove: Button
    lateinit var etFruitName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        rvFruits = findViewById(R.id.rvFruits)
        val adapter = FruitAdapter(this, fruits)
        rvFruits.adapter = adapter


        btnInsert = findViewById(R.id.btnInsert)
        btnRemove = findViewById(R.id.btnRemove)
        etFruitName = findViewById(R.id.etFruitName)


        btnInsert.setOnClickListener {
            fruits.add(etFruitName.text.toString())
            adapter.notifyItemInserted(fruits.lastIndex)
        }

        btnRemove.setOnClickListener {

            val deleteFruit = etFruitName.text.toString()
            if(fruits.contains(deleteFruit)){

                val index = fruits.indexOf(deleteFruit)
                fruits.remove(deleteFruit)
                adapter.notifyItemRemoved(index)

            }
        }
    }
}