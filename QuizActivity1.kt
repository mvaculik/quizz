package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)  // Make sure this line matches the layout file name

        val answerButton1: Button = findViewById(R.id.answerButton1)
        answerButton1.setOnClickListener {
            // Assuming the button answerButton1 has the correct answer "2"
            val userAnswer = answerButton1.text.toString()
            val correctAnswer = "2"
            val score = if (userAnswer == correctAnswer) {
                // The user selected the correct answer
                1
            } else {
                // The user selected the wrong answer
                0
            }
            val intent = Intent(this, QuizActivity2::class.java)
            intent.putExtra("SCORE", score)
            startActivity(intent)
        }
    }
}
