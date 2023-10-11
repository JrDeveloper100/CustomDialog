package com.example.customdialog

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOpen: Button = findViewById(R.id.btnOpen)
        val btnOpen2: Button = findViewById(R.id.btnOpen2)
        val btnOpen3: Button = findViewById(R.id.btnOpen3)
        val btnOpen4: Button = findViewById(R.id.btnOpen4)
        val btnOpen5: Button = findViewById(R.id.btnOpen5)
        val btnOpen6: Button = findViewById(R.id.btnOpen6)
        btnOpen.setOnClickListener {
            CustomDialog.alertDialog1(this)
        }
        btnOpen2.setOnClickListener {
            CustomDialog.alertDialog2(this)
        }
        btnOpen3.setOnClickListener {
            CustomDialog.alertDialog3(this)
        }
        btnOpen4.setOnClickListener {
            CustomDialog.alertDialog4(this)
        }
        btnOpen5.setOnClickListener {
            CustomDialog.alertDialog5(this)
        }
        btnOpen6.setOnClickListener {
            CustomDialog.alertDialog6(this)
        }
    }
}