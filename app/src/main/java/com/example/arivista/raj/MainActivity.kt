package com.example.arivista.raj

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import arivista.lib.dragdrop.CustomView
import arivista.lib.dragdrop.Optionmodel

import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    val data = ArrayList<Optionmodel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val customView = findViewById<CustomView>(R.id.customView)
        customView.setImage(R.drawable.demoimage)
        data.add(Optionmodel("14th Jan", 900, 300, 320, 80))
        data.add(Optionmodel("15th Aug", 900, 100, 320, 80))
        data.add(Optionmodel("25th Dec", 900, 500, 320, 80))
        data.add(Optionmodel("12 May", 900, 1100, 320, 80))
        data.add(Optionmodel("14th Feb", 900, 700, 320, 80))
        data.add(Optionmodel("4 Aug", 900, 900, 320, 80))
        customView.setInput(data)
    }
}


