package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val tombol = findViewById<Button>(R.id.nama)
        val tombol1 = findViewById<Button>(R.id.Kelas)
        val tombol2 = findViewById<Button>(R.id.Nis)

        tombol.setOnClickListener {
            Toast.makeText(this,"Daffa' Raihan Nabawi",Toast.LENGTH_SHORT).show()
        }
        tombol1.setOnClickListener {
            Toast.makeText(this,"XI PPLG 1",Toast.LENGTH_SHORT).show()
        }
        tombol2.setOnClickListener {
            Toast.makeText(this,"2233248",Toast.LENGTH_SHORT).show()
        }
    }
}