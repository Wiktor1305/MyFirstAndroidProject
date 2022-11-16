package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE="com.example.myfirstandroidproject.MESSAGE"

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    fun sureHawajska(view: View?) {
        //Wykorzystanie klasy Android AlertDialog.
        val menu = "Rodzaj: Pizza Hawajska, "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    fun surePeperoni(view: View?) {
        val menu = "Rodzaj: Pizza Peperoni, "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    fun sureWiejska(view: View?) {
        val menu = "Rodzaj: Pizza Wiejska, "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    fun sureKebab(view: View?) {
        val menu = "Rodzaj: Pizza Kebab, "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }
}