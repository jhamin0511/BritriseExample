package com.github.jhamin0511.britriseexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val cal = Calculate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneText: TextView = findViewById(R.id.one)
        val twoText: TextView = findViewById(R.id.two)
        val typeButton: Button = findViewById(R.id.type)
        val calButton: Button = findViewById(R.id.calculate)
        val resultText: TextView = findViewById(R.id.result)

        calButton.setOnClickListener {
            val first = oneText.text.toString().toInt()
            val second = twoText.text.toString().toInt()
            val result = cal.result(first, second)

            resultText.setText(result)
        }
    }

}
