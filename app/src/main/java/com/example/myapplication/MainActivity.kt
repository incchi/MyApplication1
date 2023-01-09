package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mytext = findViewById<TextView>(R.id.textView)
        mytext.text="Counter"
        val countbutton = findViewById<Button>(R.id.count)
        var timesclicked = 0

        countbutton.setOnClickListener {

            timesclicked+=1
            mytext.text=timesclicked.toString()
            //Toast.makeText(this,"Hii, I'm incchi", Toast.LENGTH_LONG).show()
        }
        val resetbutton = findViewById<Button>(R.id.reset)
        resetbutton.setOnClickListener {
            timesclicked=0
            mytext.text=timesclicked.toString()
        }

    }
}