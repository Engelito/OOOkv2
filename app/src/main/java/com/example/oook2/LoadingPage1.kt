package com.example.oook2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class LoadingPage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_page1)


        // We are creating a variable with the image of our logo and put in a time
        // where we can see the logo and create a fade in and out for the image to work
        val iv_note: ImageView = findViewById(R.id.iv_note)
        iv_note.alpha = 0f
        iv_note.animate().setDuration(3000).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}
