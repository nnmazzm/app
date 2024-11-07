package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var textViewGreeting: TextView
    private lateinit var buttonOkay: Button
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        textViewGreeting = findViewById(R.id.textViewGreeting)
        buttonOkay = findViewById(R.id.buttonOkay)
        buttonNext = findViewById(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val name = editTextName.text.toString()
            textViewGreeting.text = "Hello, $name"
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}