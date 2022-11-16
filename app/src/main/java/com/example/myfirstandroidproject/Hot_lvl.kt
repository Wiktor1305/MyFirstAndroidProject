package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Hot_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.peperoni_hot_lvl)
    }

    fun lvlPiripiri(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Piripiri), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    fun lvlWasabi(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Wasabi), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    fun lvlJalapeno(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Jalapeno), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

}