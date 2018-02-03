package com.iteso.sesion5

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ActivityMain : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        findViewById(R.id.limpiar).setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        findViewById(R.id.action_settings).setOnClickListener(this)
        when(view?.id){
            R.id.action_settings -> {
                Toast.makeText(this, "Nombre:" +"             "+
                        "Telefono:"+"                          "+"Escolaridad:"+"         "+"Genero:"+"             "+"Libro:"+"             "+  "Deporte"+"             ", Toast.LENGTH_SHORT).show()

            }
        }

        when(view?.id){
            R.id.limpiar -> ResetearPantalla()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.activity_menu, menu)
        return true
    }


    fun ResetearPantalla(){
        //Configuramos el intent pasandole el class de la actividad a los que nos dirigimos
        val intent = Intent(this,ActivityMain::class.java)
        startActivity(intent)

    }

}

