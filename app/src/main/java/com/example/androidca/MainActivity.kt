package com.example.androidca

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var b: Button
    lateinit var e: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        b = findViewById(R.id.bt1)
        e = findViewById(R.id.et1)
        b.setOnClickListener {
            if(e.text.toString().isEmpty()) {
                Toast.makeText(this,"Amount cannot be empty",Toast.LENGTH_LONG).show()
            }
            else if(e.text.toString().toInt() < 0) {
                Toast.makeText(this,"Enter valid amount",Toast.LENGTH_LONG).show()
            }
            else if(e.text.toString().toInt() < 2000 && e.text.toString().toInt() > 0) {
                Toast.makeText(this,"Hostel Booked",Toast.LENGTH_LONG).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}