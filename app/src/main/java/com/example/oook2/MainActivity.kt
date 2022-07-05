package com.example.oook2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun handleText(view: View) {
        val op: EditText = findViewById(R.id.editText1)
        val getOP: TextView = findViewById(R.id.textView1)
        //get operation from edit text

        var str: String = op.text.toString()
        //put into textview
        getOP.setText(str)

    }
}