package com.example.myapplicationcalculadoracontroloscumuns

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultTextView = findViewById<TextView>(R.id.resultInSecondActivity)

        // Recupera o resultado passado pela MainActivity
        val result = intent.getDoubleExtra(MainActivity.PARAM_RESULT, 0.0)

        // Define o texto do TextView com o resultado
        resultTextView.text = "Resultado: $result"
    }
}