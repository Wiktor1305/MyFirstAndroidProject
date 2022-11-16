package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Ciasto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_ciasto)
    }

    //Ciasto cienkie
    fun cienkieCiasto(view: View){
        val rozmiar=intent.getStringExtra(EXTRA_MESSAGE)
        val ciasto = rozmiar+"rodzaj ciasta: cienkie."
        val intent = Intent(this, Podsumowanie::class.java).apply {
            putExtra(EXTRA_MESSAGE, ciasto)
        }
        startActivity(intent)
    }

    //Ciasto puszyste
    fun puszysteCiasto(view: View){
        val rozmiar=intent.getStringExtra(EXTRA_MESSAGE)
        val ciasto = rozmiar+"rodzaj ciasta: puszyste."
        val intent = Intent(this, Podsumowanie::class.java).apply {
            putExtra(EXTRA_MESSAGE, ciasto)
        }
        startActivity(intent)
    }

}