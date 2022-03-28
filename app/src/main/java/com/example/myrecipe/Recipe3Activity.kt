package com.example.myrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recipe3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe3)

        val nextActButton = findViewById<Button>(R.id.next3btn)
        nextActButton.setOnClickListener {
            val Intent = Intent(this, RecipeActivity::class.java)
            startActivity(Intent)

        }
    }
}