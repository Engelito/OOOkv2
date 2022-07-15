package com.example.oook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // We are creating a variable along with a button so we can use the button
        // to go to the about us page or the Intro page
        val bk_button: Button = findViewById(R.id.bk_button)

        bk_button.setOnClickListener{
            val intent = Intent(this, IntroPage::class.java)
            startActivity(intent)
        }
    }
}