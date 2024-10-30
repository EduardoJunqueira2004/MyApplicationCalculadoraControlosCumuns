package com.example.myapplicationcalculadoracontroloscumuns

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultTextView = findViewById<TextView>(R.id.resultInSecondActivity)

        // Recupera os valores passados pela MainActivity
        val result = intent.getDoubleExtra(MainActivity.PARAM_RESULT, 0.0)
        val number1 = intent.getDoubleExtra(MainActivity.PARAM_NUMBER1, 0.0)
        val number2 = intent.getDoubleExtra(MainActivity.PARAM_NUMBER2, 0.0)

        // Define o texto do TextView com os detalhes
        resultTextView.text = "Preço unitário: $number1\nQuantidade: $number2\nValor total: $result"
    }
    }
