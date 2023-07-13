package com.example.healthtrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnButton: Button = findViewById<Button>(R.id.btnButton)
        btnButton.setOnClickListener {
            val intent = Intent(this, SetMedicineActivity::class.java)
            startActivity(intent)
        }
    }
}
