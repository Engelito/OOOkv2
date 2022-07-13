package com.example.oook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_page)


        val button_Go: Button = findViewById(R.id.button_Go)

        button_Go.setOnClickListener {
            val intent = Intent(this, LoadingPage1::class.java)
            startActivity(intent)
        }

        val bt_about: Button = findViewById(R.id.bt_about)

        bt_about.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)

        }
    }
}