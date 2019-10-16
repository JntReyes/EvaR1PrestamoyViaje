package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import android.content.Intent

class menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnCalcularV.setOnClickListener {
            val intent:Intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

        btnSimular.setOnClickListener {
            val intent:Intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
