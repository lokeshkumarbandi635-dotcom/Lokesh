package com.example.jarvis

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val statusText = findViewById<TextView>(R.id.statusText)
        val activateButton = findViewById<Button>(R.id.activateButton)

        activateButton.setOnClickListener {
            statusText.text = getString(R.string.jarvis_online)
            activateButton.text = getString(R.string.jarvis_active)
        }
    }
}
