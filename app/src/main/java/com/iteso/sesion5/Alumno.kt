package com.iteso.sesion5

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner

/**
 * Created by egual on 02/02/2018.
 */
class Alumno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nombre = findViewById(R.id.nombre) as EditText;
        Telefono = findViewById(R.id.telefono) as EditText;
        Escolaridad = findViewById(R.id.escolaridad) as Spinner;
        //Genero = findViewById(R.id.tv_genero) as EditText;
        Libro = findViewById(R.id.libro) as EditText;
        //Deporte = findViewById(R.id.deporte) as CheckBox;

    }
    private var Nombre: EditText? = null
    private var Telefono: EditText? = null
    private var Escolaridad: Spinner? = null
    //private var Genero: EditText? = null
    private var Libro: EditText? = null
    private var Deporte: CheckBox? = null
    private var Limpiar: Button? = null


}
