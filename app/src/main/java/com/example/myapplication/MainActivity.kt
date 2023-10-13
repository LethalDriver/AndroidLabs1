package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity((intent))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello World"

        val nextViewButton = findViewById<Button>(R.id.button1)

        nextViewButton.setOnClickListener { openSecondActivity() }
    }
}