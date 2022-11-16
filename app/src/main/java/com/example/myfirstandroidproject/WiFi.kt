package com.example.myfirstandroidproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.View
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WiFi : AppCompatActivity() {
    //wykorzystanie komponentu Android Broadcast Receiver do włączania WiFi w smartfonie

    lateinit var wifiSwitch: Switch
    lateinit var wifiManager: WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pizza_wifi)

        wifiSwitch = findViewById(R.id.wifiSwitch)



        wifiSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val panelIntent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(panelIntent, 1);
            } else {
                val panelIntent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(panelIntent, 0);
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
        registerReceiver(wifiStateReceiver, intentFilter)
    }

    private val wifiStateReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            Log.println( Log.INFO,"wifi receiver", "received!")
            Log.println(Log.INFO, "wifi receiver", intent.getIntExtra(
                WifiManager.EXTRA_WIFI_STATE,
                WifiManager.WIFI_STATE_UNKNOWN
            ).toString())
            when (intent.getIntExtra(
                WifiManager.EXTRA_WIFI_STATE,
                WifiManager.WIFI_STATE_UNKNOWN
            )) {

                WifiManager.WIFI_STATE_ENABLED -> {
                    wifiSwitch.isChecked = true
                    wifiSwitch.text = "WiFi jest włączone"
                    Toast.makeText(this@WiFi, "Wifi jest włączone", Toast.LENGTH_SHORT).show()
                }

                WifiManager.WIFI_STATE_DISABLED -> {
                    wifiSwitch.isChecked = false
                    wifiSwitch.text = "WiFi jest wyłączone"
                    Toast.makeText(this@WiFi, "Wifi jest wyłączone", Toast.LENGTH_SHORT).show()
                }

                WifiManager.WIFI_STATE_UNKNOWN -> {
                    wifiSwitch.text = "WiFi off/on"
                    Toast.makeText(this@WiFi, "Wifi is Unknown", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
    fun przyciskDalej(view: View?) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}