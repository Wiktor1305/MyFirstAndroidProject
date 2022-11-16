package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE="com.example.pizzaskowronski.MESSAGE"

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    fun sureHawajska(view: View?) {
        //Wykorzystanie klasy Android AlertDialog.
        val intent = Intent(this, Rozmiar::class.java)
        startActivity(intent)
    }

    fun surePeperoni(view: View?) {
        val intent = Intent(this, Rozmiar::class.java)
        startActivity(intent)
    }

    fun sureWiejska(view: View?) {
        val intent = Intent(this, Rozmiar::class.java)
        startActivity(intent)
    }

    fun sureKebab(view: View?) {
        val intent = Intent(this, Rozmiar::class.java)
        startActivity(intent)
    }
}