package com.example.android.homeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import modal.Circle
import modal.Shape

class CircleActivity : AppCompatActivity() {

    private lateinit var btnArea: Button
    private lateinit var btnPerimetr: Button
    private lateinit var editRadius: EditText
    private lateinit var textView: TextView
    var radius = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        btnArea = findViewById(R.id.circle_area)
        btnPerimetr = findViewById(R.id.circle_perimetr)
        editRadius = findViewById(R.id.edittext)
        textView = findViewById(R.id.circle_textview)

        btnArea.setOnClickListener(View.OnClickListener {
            val inputString = editRadius.text.toString()

            radius = if (!inputString.isEmpty()) inputString.toDouble() else 0.0

            var shape: Shape = Circle(0.0,0.0, radius)
            textView.text = "Area = " + shape.area.toString()

        })

        btnPerimetr.setOnClickListener(View.OnClickListener {
            val inputString = editRadius.text.toString()

            radius = if (!inputString.isEmpty()) inputString.toDouble() else 0.0

            var shape: Shape = Circle(0.0,0.0, radius)
            textView.text = "Perimetr = " + shape.perimetr.toString()

        })

    }



}
