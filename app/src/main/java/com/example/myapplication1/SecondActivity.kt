package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {


    private lateinit var textViewCounter: TextView
    private lateinit var buttonClick: Button
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textViewCounter = findViewById(R.id.textViewCounter)
        buttonClick = findViewById(R.id.buttonClick)

        // Set initial counter value to 0
        textViewCounter.text = counter.toString()

        // Increment counter when button is clicked
        buttonClick.setOnClickListener {
            counter++
            textViewCounter.text = counter.toString()
        }
    }
}
