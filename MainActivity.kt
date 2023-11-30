package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startQuizButton: Button = findViewById(R.id.startQuizButton)
        startQuizButton.setOnClickListener {
            // Start the first quiz activity
            val intent = Intent(this, QuizActivity1::class.java)
            startActivity(intent)
        }
    }
}
