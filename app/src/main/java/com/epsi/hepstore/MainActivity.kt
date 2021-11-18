package com.epsi.hepstore

import android.content.Intent
import android.os.Build
import android.view.WindowInsets
import android.view.WindowManager

import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity


import android.widget.Button

import android.os.Bundle


class MainActivity : AppCompatActivity() {

    //Declaration de mon bouton
    lateinit var buttonChanger : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialisation
        buttonChanger = findViewById(R.id.startbtn)

        // creation de notre intent
        val monIntent : Intent =  Intent(this, homepage::class.java)

        //clic sur le bouton
        buttonChanger.setOnClickListener {
            startActivity(monIntent)
        }
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
            window.insetsController?.hide(WindowInsets.Type.statusBars())
     else {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
    }
}