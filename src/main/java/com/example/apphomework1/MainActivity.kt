package com.example.homework1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.apphomework1.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan elemen UI dengan kode Kotlin
        val inputText = findViewById<EditText>(R.id.inputText)
        val button = findViewById<Button>(R.id.button)
        val resultText = findViewById<TextView>(R.id.resultText)

        // Menambahkan aksi onClick untuk Button
        button.setOnClickListener {
            // Mendapatkan teks dari EditText
            val textInput = inputText.text.toString()

            // Menghitung jumlah karakter dari teks yang dimasukkan
            val charCount = textInput.length

            // Menampilkan hasil jumlah karakter di TextView resultText
            resultText.text = "Jumlah karakter: $charCount"
        }
    }
}
