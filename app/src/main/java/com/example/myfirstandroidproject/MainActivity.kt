package com.example.myfirstandroidproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Uruchomienie nowej aktywności
    fun wyborPizzy(view: View?) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}