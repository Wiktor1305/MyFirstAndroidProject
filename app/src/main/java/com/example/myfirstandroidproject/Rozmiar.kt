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
    fun malaPizza(view: View){
        val intent = Intent(this, Ciasto::class.java)
        startActivity(intent)

    }

    fun sredniaPizza(view: View){
        val intent = Intent(this, Ciasto::class.java)
        startActivity(intent)

    }

    fun duzaPizza(view: View){
        val intent = Intent(this, Ciasto::class.java)
        startActivity(intent)

    }
}