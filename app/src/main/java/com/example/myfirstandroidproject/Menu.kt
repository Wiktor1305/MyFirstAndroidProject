package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE="com.example.myfirstandroidproject.MESSAGE"

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_menu)
    }

    fun sureHawajska(view: View?) {
        //Wykorzystanie klasy Android AlertDialog.
        val builder = AlertDialog.Builder(this@Menu)
        builder.setTitle("Wybrano: Pizza Hawajska")
        builder.setMessage("Jesteś prawdziwym smakoszem pizzy?")
        builder.setPositiveButton("Nie") { dialog, which ->
            Toast.makeText(
                applicationContext,
                "Włosi nie uznają ananasa na pizzy...",
                Toast.LENGTH_SHORT
            ).show()

        val menu = "Rodzaj: Pizza Hawajska, "
        val intent = Intent(this, Rozmiar::class.java).apply {
            putExtra(EXTRA_MESSAGE, menu)
        }
        startActivity(intent)
        }

        builder.setNegativeButton("Tak") { dialog, which ->
            Toast.makeText(
                applicationContext,
                "Prawdziwi smakosze nie uznają ananasa na pizzy. Wybierz inną.",
                Toast.LENGTH_SHORT
            ).show()
        }

        builder.setNeutralButton("Wróć") { _, _ ->
            Toast.makeText(
                applicationContext,
                "Jesteś niezdecydowany. Wybierz pizze",
                Toast.LENGTH_SHORT
            ).show()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
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