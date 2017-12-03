package com.example.android.homeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import modal.Shape
import modal.Triangle

class TriangleActivity : AppCompatActivity() {

    private lateinit var btnArea: Button
    private lateinit var btnPerimetr: Button
    private lateinit var editA: EditText
    private lateinit var editB: EditText
    private lateinit var editC: EditText
    private lateinit var textView: TextView
    private var a = 0.0
    private var b = 0.0
    private var c = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        btnArea = findViewById(R.id.triangle_area)
        btnPerimetr = findViewById(R.id.triangle_perimetr)
        editA= findViewById(R.id.a)
        editB= findViewById(R.id.b)
        editC= findViewById(R.id.c)
        textView = findViewById(R.id.triangle_textview)

        btnArea.setOnClickListener(View.OnClickListener {
            val aInput = editA.text.toString()
            val bInput = editB.text.toString()
            val cInput = editC.text.toString()

            a = if (!aInput.isEmpty()) aInput.toDouble() else 0.0
            b = if (!bInput.isEmpty()) bInput.toDouble() else 0.0
            c = if (!cInput.isEmpty()) cInput.toDouble() else 0.0

            if (isTriangle()) {
                var shape: Shape = Triangle(0.0,0.0, a, b, c)
                textView.text = "Area = " + shape.area.toString()
            }
            else {
                Toast.makeText(applicationContext, "Error! It's not trialgle", Toast.LENGTH_SHORT).show()
            }
        })

        btnPerimetr.setOnClickListener(View.OnClickListener {
            val aInput = editA.text.toString()
            val bInput = editB.text.toString()
            val cInput = editC.text.toString()

            a = if (!aInput.isEmpty()) aInput.toDouble() else 0.0
            b = if (!bInput.isEmpty()) bInput.toDouble() else 0.0
            c = if (!cInput.isEmpty()) cInput.toDouble() else 0.0

            if (isTriangle()) {
                var shape: Shape = Triangle(0.0,0.0, a, b, c)
                textView.text = "Perimetr = " + shape.perimetr.toString()
            }
            else {
                Toast.makeText(applicationContext, "Error! It's not trialgle", Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun isTriangle() : Boolean {
        var retVal = false

        if ((a + b) > c && (a + c) > b && (c + b) > a)
            retVal = true

        return retVal
    }
}
