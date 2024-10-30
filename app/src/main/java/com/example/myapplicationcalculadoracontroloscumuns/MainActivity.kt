package com.example.myapplicationcalculadoracontroloscumuns

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var result: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1EditText = findViewById<EditText>(R.id.number1)
        val number2EditText = findViewById<EditText>(R.id.number2)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val openSecondActivityButton = findViewById<Button>(R.id.openSecondActivityButton)
        resultTextView = findViewById(R.id.result)

        calculateButton.setOnClickListener {
            val number1Text = number1EditText.text.toString()
            val number2Text = number2EditText.text.toString()

            if (number1Text.isNotEmpty() && number2Text.isNotEmpty()) {
                val number1 = number1Text.toDouble()
                val number2 = number2Text.toDouble()

                // Exemplo de operação de soma
                result = number1 + number2
                resultTextView.text = "Resultado: $result"

                // Exibir o resultado em um Toast usando R.string.result_message
                val toastMessage = getString(R.string.result_message, result.toString())
                Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, insira ambos os números", Toast.LENGTH_SHORT).show()
            }
        }

        openSecondActivityButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(PARAM_RESULT, result)
            startActivity(intent)
        }
    }

    companion object {
        const val PARAM_RESULT = "PARAM_RESULT"
    }
}