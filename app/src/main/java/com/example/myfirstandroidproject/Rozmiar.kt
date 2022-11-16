package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Rozmiar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_rozmiar)
    }

    //Rozmiar: mała
    fun malaPizza(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val rozmiar = menu+"rozmiar: mała (30cm), "
        val intent = Intent(this, Ciasto::class.java).apply {
            putExtra(EXTRA_MESSAGE, rozmiar)
        }
        startActivity(intent)

    }

    //Rozmiar: średnia
    fun sredniaPizza(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val rozmiar = menu+"rozmiar: średnia (40cm), "
        val intent = Intent(this, Ciasto::class.java).apply {
            putExtra(EXTRA_MESSAGE, rozmiar)
        }
        startActivity(intent)

    }

    //Rozmiar: duża
    fun duzaPizza(view: View){
        val menu=intent.getStringExtra(EXTRA_MESSAGE)
        val rozmiar = menu+"rozmiar: duża (50cm), "
        val intent = Intent(this, Ciasto::class.java).apply {
            putExtra(EXTRA_MESSAGE, rozmiar)
        }
        startActivity(intent)

    }

}