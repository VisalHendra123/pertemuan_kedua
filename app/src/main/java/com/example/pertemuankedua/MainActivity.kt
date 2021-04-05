package com.example.pertemuankedua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editInput1 = findViewById(R.id.editInput1) as EditText
        var editInput2 = findViewById(R.id.editInput2) as EditText
        var editHasil = findViewById(R.id.editHasil) as EditText

        var btnHitung = findViewById<Button>(R.id.btnHitung)

        btnHitung?.setOnClickListener {
            val input1:Int = editInput1.getText().toString().toInt()
            val input2:Int = editInput2.getText().toString().toInt()

            val hasil:Int = input1 + input2
            editHasil.setText(hasil.toString())
        }

    }
}