package com.routio.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart : Button = findViewById(R.id.buttonStart)
        val editText : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener{
            if (editText.text.isNotEmpty()) {
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editText.text.toString())
                startActivity(intent)
                finish()

            }else {
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_LONG).show()
            }
        }
    }
}