package com.darelshroo.aristidevcourse.kotlin_syntax

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.darelshroo.aristidevcourse.R

class functionsInKotlin {
    /*Función Simple con Tipado*/
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    /*Función con Tipos Nullables*/
    fun obtenerLongitud(cadena: String?): Int? {
        return cadena?.length
    }

    /*Función que no Retorna Valor (Unit)*/
    fun mostrarMensaje(mensaje: String): Unit {
        println(mensaje)
    }

    /*Función con Lambda como Parámetro*/
    fun realizarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }

    // Uso
    val suma = realizarOperacion(3, 4) { x, y -> x + y }

}

/*Funciones en un Activity de Android*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llamando a funciones con tipado
        val resultadoSuma = sumar(5, 7)
        mostrarToast("Resultado de la suma: $resultadoSuma")

        val longitud = obtenerLongitud("Hola, Kotlin")
        mostrarToast("Longitud de la cadena: $longitud")

        // Usando función con lambda
        val multiplicacion = realizarOperacion(6, 8) { x, y -> x * y }
        mostrarToast("Resultado de la multiplicación: $multiplicacion")
    }

    // Función para sumar dos números
    private fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    // Función para mostrar un Toast
    private fun mostrarToast(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }

    // Función que devuelve la longitud de una cadena o null si la cadena es null
    private fun obtenerLongitud(cadena: String?): Int? {
        return cadena?.length
    }

    // Función que realiza una operación sobre dos números usando una lambda
    private fun realizarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
        return operacion(a, b)
    }
}