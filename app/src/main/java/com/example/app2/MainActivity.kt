package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHola = findViewById<Button>(R.id.btnHola)
        val eddUser = findViewById<EditText>(R.id.eddUser)
        btnHola.setOnClickListener{
        Toast.makeText(this@MainActivity,eddUser.text,Toast.LENGTH_SHORT).show()
        }

    }


}