package com.example.android.homeworkthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var  button: Button
    private lateinit var shapeSelected: String
    private val shapes = arrayOf("Circle", "Triangle","Rectangle")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spinner)
        button = findViewById(R.id.button)

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shapes)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    shapeSelected = shapes.get(position)
            }
        }

        button.setOnClickListener(View.OnClickListener {

            if (shapeSelected == "Triangle") {
                var intent = Intent(applicationContext, TriangleActivity::class.java)
                startActivity(intent)
            } else if (shapeSelected == "Circle") {
                var intent = Intent(applicationContext, CircleActivity::class.java)
                startActivity(intent)
            }
            else if (shapeSelected == "Rectangle") {
                var intent = Intent(applicationContext, RectangleActivity::class.java)
                startActivity(intent)
            }
        })

    }
}
