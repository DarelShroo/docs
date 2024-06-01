package com.darelshroo.aristidevcourse.kotlin_syntax

class typeDataInKotlin {
    // Singleton object
    object MiSingleton {
        fun saludar() = "Hola, soy un singleton"
    }

    fun tiposKotlin(){
        /*Tipos en Kotlin*/
        val bytes_: Byte = 10
        val short_: Short = 1
        val int_: Int = 1
        val long_: Long = 2

        val float_: Float = 1.5f
        val double_: Double = 3.14

        val char_: Char = 'A'
        val boolean_: Boolean = true

        val string_: String = "Hola, Kotlin"
        val nullableString: String? = null

        val intArray: IntArray = intArrayOf(1, 2, 3)
        val stringArray: Array<String> = arrayOf("uno", "dos", "tres")

        val list_: List<Int> = listOf(1, 2, 3)
        val mutableList_: MutableList<Int> = mutableListOf(1, 2, 3)

        val set_: Set<String> = setOf("A", "B", "C")
        val mutableSet_: MutableSet<String> = mutableSetOf("A", "B", "C")

        val map_: Map<String, Int> = mapOf("uno" to 1, "dos" to 2)
        val mutableMap_: MutableMap<String, Int> = mutableMapOf("uno" to 1, "dos" to 2)

        // Función de tipo
        val funcion: (Int) -> Int = { it * 2 }
        println("Resultado de la función: ${funcion(5)}")

        // Clases y objetos
        class Persona(val nombre: String, var edad: Int)
        val persona = Persona("Juan", 30)
        println("Nombre: ${persona.nombre}, Edad: ${persona.edad}")

        // Uso del singleton
        println(MiSingleton.saludar())

        // Data class
        data class Usuario(val nombre: String, val edad: Int)
        val usuario = Usuario("Ana", 25)
        println("Usuario: $usuario")

        // Uso del type alias
        val nombreCompleto: NombreCompleto = "Juan Pérez"
        println("Nombre Completo: $nombreCompleto")

        // Ejemplo de uso de tipos nullables
        val nombre: String? = "Kotlin"
        if (nombre != null) {
            println("Nombre no nulo: $nombre")
        } else {
            println("Nombre es nulo")
        }

        // Uso de listas y bucles
        for (elemento in list_) {
            println("Elemento de la lista: $elemento")
        }

        // Manejo de mapas
        for ((clave, valor) in map_) {
            println("Clave: $clave, Valor: $valor")
        }

        // Ejemplo de manejo de excepciones
        try {
            val resultado = 10 / 0
            println("Resultado: $resultado")
        } catch (e: ArithmeticException) {
            println("Error: División por cero")
        }

        // Uso de lambda
        val suma: (Int, Int) -> Int = { a, b -> a + b }
        println("Suma de 3 y 4: ${suma(3, 4)}")
    }

}

// Type alias
typealias NombreCompleto = String;