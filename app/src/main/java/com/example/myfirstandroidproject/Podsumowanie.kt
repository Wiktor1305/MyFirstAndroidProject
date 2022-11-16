package com.example.myfirstandroidproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Podsumowanie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_podsumowanie)

        //przesłane wartości konstruują nam podsumowanie z dokonanych wyborów
        val ciasto=intent.getStringExtra(EXTRA_MESSAGE)
        val textView=findViewById<TextView>(R.id.wielkosc).apply{
            text=ciasto
        }
    }
}