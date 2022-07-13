package com.example.oook2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private val equation = mutableListOf<String>()
    private val stepsToSolve = mutableListOf<String>()
    private val add = {a:Float,b:Float -> a + b}
    private val sub = {a:Float,b:Float -> a - b}
    private val mult = {a:Float,b:Float -> a * b}
    private val div = {a:Float,b:Float -> a / b}
    private val expo = {a:Float,b:Float -> a.pow(b)}
    private val ops = mapOf("+" to add, "-" to sub,"*" to mult,"/" to div, "^" to expo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    public fun handleText(view: View) {
        val op: EditText = findViewById(R.id.editText1)
        val getOP: TextView = findViewById(R.id.textView1)
        val resetButton = findViewById<Button>(R.id.reset)
        //get operation from edit text

        getOP.text = ""
        stepsToSolve.clear()
        equation.clear()

        var str: String = op.text.toString()
        stepsToSolve.add(str)
        for (item in str.split(" "))
        {
            equation.add(item)
        }
        val result = runEquation(equation)
        getOP.text = (stepsToSolve.toString().replace("[","").replace("]","").replace(",","\n"))
        resetButton.setOnClickListener{ reset()}

    }
    fun doMath(oper:String, equation:MutableList<String>): MutableList<String> {
        val myIndex = equation.indexOf(oper)
        val result = ops[oper]?.let { it(equation[myIndex-1].toFloat(), equation[myIndex+1].toFloat()) }
        equation.removeAt(myIndex -1)
        equation.removeAt(myIndex-1)
        equation[myIndex-1]= result.toString()
        stepsToSolve.add(equation.toString().replace(',',' '))
        return equation
    }

    fun runEquation(equation: MutableList<String>): MutableList<String> {
        var newEquation = mutableListOf<String>()
        val operators = listOf<String>("^","/","*","+","-")

        for(oper in operators)
        {
            while(oper in equation)
            {
                newEquation = doMath(oper, equation)
            }

        }
        return newEquation

    }

    fun reset(){
        val getOP: TextView = findViewById(R.id.textView1)
        getOP.text = ""
        stepsToSolve.clear()
        equation.clear()
    }
}