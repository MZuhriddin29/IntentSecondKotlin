package com.example.intentsecondkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.intentsecondkotlin.model.Student


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val b_check = findViewById<Button>(R.id.b_check)
        b_check.setOnClickListener{
            var student = Student(21,"Zuhriddin")
            openSecondActivity(student)}
    }

    private fun openSecondActivity(student : Student) {
        var intentz = Intent(this , SecondActivity::class.java)
        intentz.putExtra("zzzz", student)
        startActivity(intentz)
    }
}