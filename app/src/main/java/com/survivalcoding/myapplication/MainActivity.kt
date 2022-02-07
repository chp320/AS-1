package com.survivalcoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 새로 추가한 버튼의 id를 통해 버튼과 텍스트뷰를 가져옴
        val clickButton = findViewById<Button>(R.id.clickButton)
        val textView = findViewById<TextView>(R.id.textView)

        clickButton.setOnClickListener {
            textView.text = "버튼을 눌렀습니다."
        }

    }
}