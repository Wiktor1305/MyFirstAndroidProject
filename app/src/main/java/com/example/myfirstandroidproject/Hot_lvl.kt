package com.example.myfirstandroidproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Hot_lvl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.peperoni_hot_lvl)

        //Alert ostrości
        val alert = AlertDialog.Builder(this@Hot_lvl)
        alert.setTitle("Uwaga!!!")
        alert.setMessage("Nasza pizza peperoni jest naprawdę ostra!!!")

        val dymek: AlertDialog = alert.create()
        dymek.show()

        //Zmiana koloru tła na czerwony (symbol ostrości)
        var background = findViewById(R.id.background) as ConstraintLayout
        background.setBackgroundColor(Color.RED)
    }

    //Lvl I ostrości
    fun lvlPiripiri(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Piripiri), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    //Lvl II ostrości
    fun lvlWasabi(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Wasabi), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

    //Lvl III ostrości
    fun lvlJalapeno(view: View){
        val menu = "Rodzaj: Pizza Peperoni (Jalapeno), "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
    }

}