package com.example.myrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)


        val nextActButton = findViewById<Button>(R.id.next1btn)
        nextActButton.setOnClickListener {
            val Intent = Intent(this,Recipe2Activity::class.java)
            startActivity(Intent)

        }
    }
}