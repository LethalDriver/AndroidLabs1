package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private fun openSecondActivity(){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity((intent))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val username = findViewById<EditText>(R.id.usernameEditText)

        loginButton.setOnClickListener {
            print(username.text.toString())
            openSecondActivity()
        }
    }
}