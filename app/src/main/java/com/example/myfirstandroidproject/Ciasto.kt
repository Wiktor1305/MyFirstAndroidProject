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
    fun cienkieCiasto(view: View){
        val intent = Intent(this, Podsumowanie::class.java)
        startActivity(intent)
    }

    fun puszysteCiasto(view: View){
        val intent = Intent(this, Podsumowanie::class.java)
        startActivity(intent)
    }
}