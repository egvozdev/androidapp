package com.example.myapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            tv.text = "Кнопка нажата!"
            Toast.makeText(this, "Нажато", Toast.LENGTH_SHORT).show()
        }
    }
}