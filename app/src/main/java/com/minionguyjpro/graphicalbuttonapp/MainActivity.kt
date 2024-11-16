package com.minionguyjpro.graphicalbuttonapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context = this
        val text = "Hello, World!"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(context, text, duration).show()
    }
}