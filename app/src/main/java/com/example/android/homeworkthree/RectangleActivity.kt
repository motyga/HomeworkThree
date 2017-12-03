package com.example.android.homeworkthree

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import modal.Rectangle
import modal.Shape

class RectangleActivity : AppCompatActivity() {

    private lateinit var btnArea: Button
    private lateinit var btnPerimetr: Button
    private lateinit var editHeight: EditText
    private lateinit var editWidth: EditText
    private lateinit var textView: TextView
    private var height = 0.0
    private var width = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        btnArea = findViewById(R.id.rectangle_area)
        btnPerimetr = findViewById(R.id.rectangle_perimetr)
        editHeight= findViewById(R.id.height)
        editWidth= findViewById(R.id.width)
        textView = findViewById(R.id.rectangle_textview)

        btnArea.setOnClickListener(View.OnClickListener {
            val heightInput = editHeight.text.toString()
            val widthInput = editWidth.text.toString()

            height = if (!heightInput.isEmpty()) heightInput.toDouble() else 0.0
            width = if (!widthInput.isEmpty()) widthInput.toDouble() else 0.0

            var shape: Shape = Rectangle(0.0,0.0, width, height)
            textView.text = "Area = " + shape.area.toString()

        })

        btnPerimetr.setOnClickListener(View.OnClickListener {
            val heightInput = editHeight.text.toString()
            val widthInput = editWidth.text.toString()

            height = if (!heightInput.isEmpty()) heightInput.toDouble() else 0.0
            width = if (!widthInput.isEmpty()) widthInput.toDouble() else 0.0

            var shape: Shape = Rectangle(0.0,0.0, width, height)
            textView.text = "Perimetr = " + shape.perimetr.toString()
        })
    }
}
