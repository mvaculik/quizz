package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class QuizActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz3)

        val answerButton3: Button = findViewById(R.id.answerButton3)
        var score = intent.getIntExtra("SCORE", 0)

        answerButton3.setOnClickListener {
            // Here you would have your answer checking logic
            score++  // For demonstration, assume the answer is correct

            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("SCORE", score)
            startActivity(intent)
        }
    }
}
