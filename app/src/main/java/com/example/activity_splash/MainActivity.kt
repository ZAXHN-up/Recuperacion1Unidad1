package com.example.activity_splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnInfo.setOnClickListener {
            //Crear objeto de la clase Intent
            val intento = Intent(this, Instalacion::class.java)
            //Se realaciona con la actividad a inciar
            startActivity(intento)
        }

        btnAyuda.setOnClickListener {
            val ayuda = Intent(this, Requisitos::class.java)
            startActivity(ayuda)
        }

        btnMas.setOnClickListener {
            val mas = Intent(this, Mas::class.java)
            startActivity(mas)
        }
    }
}

