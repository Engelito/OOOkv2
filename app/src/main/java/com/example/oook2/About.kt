package com.example.oook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val bk_button: Button = findViewById(R.id.bk_button)

        bk_button.setOnClickListener{
            val intent = Intent(this, IntroPage::class.java)
            startActivity(intent)
        }
    }
}