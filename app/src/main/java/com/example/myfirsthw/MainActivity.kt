package com.example.myfirsthw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var lastName:EditText
    lateinit var name:EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lastName=findViewById(R.id.Lastname)
        name=findViewById(R.id.Name)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            val lname=lastName.text.toString()
            val name=name.text.toString()
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("LNAME",lname )
            intent.putExtra("NAME",name)
            val text="Введите свои данные!"
            startActivity(intent)



        }
    }
}