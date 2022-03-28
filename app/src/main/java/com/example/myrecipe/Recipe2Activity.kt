package com.example.myrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipe2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe2)

        val nextActButton = findViewById<Button>(R.id.next2btn)
        nextActButton.setOnClickListener {
            val Intent = Intent(this, Recipe3Activity::class.java)
            startActivity(Intent)

        }
    }
}