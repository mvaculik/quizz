package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1) 

        val answerButton1: Button = findViewById(R.id.answerButton1)
        answerButton1.setOnClickListener {
           
            val userAnswer = answerButton1.text.toString()
            val correctAnswer = "2"
            val score = if (userAnswer == correctAnswer) {
              
                1
            } else {
             
                0
            }
            val intent = Intent(this, QuizActivity2::class.java)
            intent.putExtra("SCORE", score)
            startActivity(intent)
        }
    }
}
