package com.m.jacococovarage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { text.text = "Hello" }
        text.setOnClickListener {}
    }

    fun add(x: Int) = 5
    fun adds() =6
    fun adds(x: Int) =7
}
