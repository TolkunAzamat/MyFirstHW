package com.example.myfirsthw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var textName: TextView
    lateinit var btnBack:ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textName = findViewById(R.id.tvLastname)
        btnBack=findViewById(R.id.backbtn)


        val data = intent.getStringExtra("LNAME")
        val data2=intent.getStringExtra("NAME")
        textName.text = "$data $data2"
        btnBack.setOnClickListener{
            onBackPressed()
        }
    }
}