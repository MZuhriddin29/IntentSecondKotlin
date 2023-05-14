package com.example.intentsecondkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.intentsecondkotlin.model.Student

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var student = intent.getSerializableExtra("zzzz")
        tv_second.text = student.toString()
    }
}