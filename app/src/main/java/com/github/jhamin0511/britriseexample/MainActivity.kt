package com.github.jhamin0511.britriseexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val cal = Calculate()
    private val music1 : String = "Lesson Zero"
    private val music2 : String = "Rosario(피처링: CL, 지코)"
    private val music3 : String = "내 얘기 같아(피처링: 헤이즈)"
    private val music4 : String = "수상소감(피처링: B.I)"
    private val music5 : String = "Leica(피처링: 김사월)"
    private val music6 : String = "Leica(피처링: 김사월)"
    private val game1 = "싸이펑크2077"
    private vall build = "빌드에러 발생"

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
