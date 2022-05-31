package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class RAM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_RAM)

        val btn16GB = findViewById<RadioButton>(R.id.btn16GB)
        val btn12GB = findViewById<RadioButton>(R.id.btn12GB)
        val btn8GB = findViewById<RadioButton>(R.id.btn8GB)

        val btnCheckRAM = findViewById<Button>(R.id.btnCheckRAM)
        btnCheckRAM.setOnClickListener{
            if(btn16GB.isChecked){
            
            }

            val intent = Intent(this@RAM,Core::class.java)
            intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}