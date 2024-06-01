# Tipos de datos en Kotlin
Kotlin es un lenguaje de programación estáticamente tipado, lo que significa que cada variable y expresión tiene un tipo de dato asociado que se verifica en tiempo de compilación. Esto ayuda a garantizar la seguridad y confiabilidad del código, al evitar errores de tipo en tiempo de ejecución. A continuación, se muestra una tabla con los tipos de datos más comunes en Kotlin:

| Nombre      | Tipo            | Ejemplos                      |
|-------------|-----------------|-------------------------------|
| Booleano    | Boolean         | true, false                   |
| Entero      | Byte            | 21, 100                       |
|             | Short           | 1000, 32000                   |
|             | Int             | 34500, 34_500                 |
|             | Long            | 1000000000L, 1_000_000_000L   |
| Flotante    | Float           | 3.14f, 1.5e3f                 |
|             | Double          | 3.14, 1.5e3                   |
| Carácter    | Char            | 'a', 'B', '\n'                |
| Cadena      | String          | "Hello", "Kotlin"             |
| Arreglo     | Array           | arrayOf(1, 2, 3)              |
|             |                 | intArrayOf(1, 2, 3)           |
| Rango       | Rango           | 1..10, 'a'..'z'               |
| Lista       | List            | listOf("Chrome", "Firefox")   |
|             |                 | mutableListOf(1, 2, 3)        |
| Conjunto    | Set             | setOf(2, 4, 6)                 |
|             |                 | mutableSetOf(2, 4, 6)         |
| Mapa        | Map             | mapOf("Chrome" to "v79", "Firefox" to "v71") |
|             |                 | mutableMapOf(1 to "One", 2 to "Two")         |
| Tupla       | Pair / Triple   | Pair(1, "Uno"), Triple(1, "Uno", 1.0)        |

# Condicionales 

## if-else
```kt
if (condición) {
    // código a ejecutar si la condición es verdadera
} else {
    // código a ejecutar si la condición es falsa
}
```

## If-else como expresión
En Kotlin, if-else también puede ser utilizado como una expresión, lo que significa que puedes asignar su resultado a una variable:

```kt
val resultado = if (condición) valor1 else valor2
```

## When
`when` es similar a switch en otros lenguajes, pero es más poderoso. Puede evaluar cualquier tipo de datos y puede tener múltiples ramas. La sintaxis básica es:

```kt
when (variable) {
    valor1 -> // código a ejecutar si variable == valor1
    valor2 -> // código a ejecutar si variable == valor2
    else -> // código a ejecutar si no coincide con ninguno de los valores anteriores
}
```

También puedes usar when como una expresión, asignando el resultado a una variable o devolviéndolo:

```kt
val resultado = when {
    condición1 -> valor1
    condición2 -> valor2
    else -> valorPorDefecto
}
```

También se puede usar un rango de valores:
```kt 
val numero = 3

val resultado = when (numero) {
    in 1..6 -> "El número está entre 1 y 6"
    else -> "El número está fuera del rango de interés"
}
```

O como evaluación de tipos:

```kt
val x: Any = "Hola"

val mensaje = when (x) {
    is String -> "Es una cadena de caracteres"
    is Int -> "Es un entero"
    else -> "Es otro tipo de dato"
}

println(mensaje)
```

O usando expresiones: 

```kt
val hora = 14
val saludo = when {
    hora < 12 -> "Buenos días"
    hora < 18 -> "Buenas tardes"
    else -> "Buenas noches"
}
```

## Operador elvis 
El operador elvis (?:) es una forma concisa de manejar valores nulos:
```kt
val resultado = variableNoNula ?: valorPorDefecto
```

Si `variableNoNula` no es nula, resultado será igual a `variableNoNula`; de lo contrario, será igual a `valorPorDefecto`.

# Operadores de comparación
Kotlin utiliza los mismos operadores de comparación que muchos otros lenguajes, como `==`, `!=`, `<`,` >`, `<=` y `>=`.

Estos son los conceptos básicos de los condicionales en Kotlin. Puedes combinarlos y utilizarlos según sea necesario para controlar el flujo de tu programa.

# Funciones
Las funciones son bloques de código reutilizables que realizan tareas específicas. Son esenciales para organizar y modularizar tu código Kotlin, haciéndolo más limpio, legible y fácil de mantener. En este documento, exploraremos a fondo el mundo de las funciones en Kotlin, desde su sintaxis básica hasta conceptos avanzados como funciones de alto orden y lambdas.


## Sintaxis básica de una función
Una función en Kotlin se define utilizando la palabra clave fun, seguida del nombre de la función, paréntesis que contienen los parámetros de entrada (si los hay), una flecha (->) y el tipo de valor de retorno (opcional). A continuación, se encuentran las llaves que delimitan el cuerpo de la función, donde se implementa la lógica de la función.

```kt
    fun nombreFuncion(parametro1: Tipo1, parametro2: Tipo2): TipoRetorno {
        // Cuerpo de la función
    }

    fun sumar(a: Int, b: Int): Int {
        return a + b
    }
```

En este ejemplo, la función sumar toma dos números enteros como parámetros (a y b) y devuelve su suma como un valor entero.

## Funciones sin valor de retorno
Si una función no devuelve ningún valor, se utiliza la palabra clave Unit como tipo de retorno.
```kt
fun mostrarMensaje(mensaje: String): Unit {
    println(mensaje)
}

fun saludar() {
    println("¡Hola!")
}
```

## Funciones con parámetros predeterminados y valores nulos
```kt
fun saludarPersona(nombre: String = "Invitado") {
    println("¡Hola, $nombre!")
}

fun obtenerLongitud(cadena: String?): Int? {
    return cadena?.length
}
```

## Llamar a funciones 
Las funciones se llaman utilizando su nombre seguido de paréntesis que contienen los argumentos reales (valores) para cada parámetro.

```kt
val resultadoSuma = sumar(5, 3)
println("Resultado de la suma: $resultadoSuma")
```

## Funciones con tipos de datos
Las funciones pueden tener tipos de datos específicos para sus parámetros y valores de retorno. Esto ayuda a garantizar la seguridad y la confiabilidad del código.

```kt
fun calcularAreaCuadrado(lado: Float): Float {
    return lado * lado
}
```

## Funciones anidadas y locales 
Las funciones pueden definirse dentro de otras funciones, lo que las convierte en funciones anidadas. Las funciones locales solo son accesibles dentro de la función en la que se definen.

```kt 
fun saludarConDespedida(nombre: String) {
    fun despedirse() {
        println("¡Hasta luego!")
    }

    println("¡Hola, $nombre!")
    despedirse()
}
```

## Funciones de alto orden
Las funciones de alto orden son funciones que pueden tomar otras funciones como argumentos o devolver funciones como resultado. Esto permite un estilo de programación más flexible y expresivo.

```kt
fun operar(num1: Int, num2: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(num1, num2)
}

val suma = operar(3, 4) { x, y -> x + y }
val multiplicacion = operar(6, 8) { x, y -> x * y }

println("Resultado de la suma: $suma")
println("Resultado de la multiplicación: $multiplicacion")
```

En este ejemplo, la función operar toma tres argumentos: dos números enteros y una función que realiza una operación sobre ellos. La función operar luego invoca la función proporcionada y devuelve el resultado.

## Lambdas 
Las expresiones lambda son funciones anónimas que se escriben entre llaves y se pueden utilizar como argumentos de funciones de alto orden.

```kt
val suma = { x: Int, y: Int -> x + y }

val resultado = suma(5, 7)
println("Resultado de la suma: $resultado")


operaciones.forEach { numero ->
    println(numero * 2)
}
```

En este ejemplo, la función operaciones.forEach toma una lambda como argumento. La lambda se ejecuta para cada elemento de la lista.


## Funciones recursivas
Las funciones recursivas son funciones que se llaman a sí mismas. Se utilizan para resolver problemas que se pueden dividir en subproblemas más pequeños del mismo tipo.

```kt
fun factorial(n: Int): Int {
    if (n == 0) return 1
    else return n * factorial(n - 1)
}

val resultadoFactorial = factorial(5)
println("Factorial de 5: $resultadoFactorial")
```

## Funciones de extensión
Las funciones de extensión agregan funcionalidad a clases existentes sin modificar el código original de la clase.

```kt
fun String.esPalindromo(): Boolean {
    val reversed = this.reversed()
    return this == reversed
}

val palabra = "radar"

if (palabra.esPalindromo()) {
    println("$palabra es un palíndromo")
} else {
    println("$palabra no es un palíndromo")
}
```

## Scope Functions 
Las funciones de alcance (scope functions) son funciones que se llaman utilizando el operador . en una referencia a un objeto. Proporcionan una forma concisa de realizar operaciones comunes en objetos.

```kt
val lista = listOf(1, 2, 3, 4, 5)

lista.filter { it % 2 == 0 }.forEach { println(it) }
val persona = Persona("Juan", 30)

persona.run {
    println("Nombre: $nombre")
    println("Edad: $edad")
}
```

# Arrays y Conjuntos de Datos en Kotlin

## Arrays

* Colecciones ordenadas y de tamaño fijo.
* Se definen con arrayOf o Array.
* Acceso por índice: array[indice].
* Modificación: array[indice] = valor.
* Tamaño: array.size.
* Recorrido: for, forEach.
* Multidimensionales: arrayOf(arrayOf(...)). 
  
### Declaración: 
* ``ArrayOf()``
  
  ```kt
  val numeros = arrayOf(1, 2, 3, 4, 5)
  val nombres = arrayOf("Juan", "Ana", "Pedro", "María")
  ```

* ``Array``

  ```kt
  val frutas = Array(5) { "Fruta ${it + 1}" } // Tamaño fijo de 5 elementos
  val paises = Array(10) { i -> "País ${i + 1}" } // Con lambda para inicializar
  ``` 

### Acceso a elementos
Se accede a los elementos de un array utilizando su índice entre corchetes []. El índice comienza en 0.

```kt
println(numeros[2]) // Imprime el valor en la posición 2 (que es 3)
println(nombres[1].uppercase()) // Imprime el nombre en la posición 1 en mayúsculas
```

### Modificación de elementos
Se pueden modificar los elementos de un array asignando un nuevo valor a la posición correspondiente.

```kt
numeros[0] = 10 // Cambia el valor en la posición 0 a 10
nombres[3] = "Laura" // Cambia el nombre en la posición 3 a "Laura"
```

### Métodos de arrays
```kt
val numeros = arrayOf(1, 5, 2, 4, 3)

// Acceso a elementos
println(numeros[2]) // Imprime: 2
numeros[0] = 10 // Asigna nuevo valor al elemento en la posición 0

// Tamaño y rango
println(numeros.size) // Imprime: 5
println(numeros.contains(7)) // Imprime: false

// Recorrido y transformación
numeros.forEach { println(it) } // Imprime cada elemento en una nueva línea
val cuadrados = numeros.map { it * it } // Crea un nuevo array con los cuadrados de cada elemento

// Modificación
numeros.sort() // Ordena los elementos en orden ascendente
numeros.reverse() // Invierte el orden de los elementos

// Conversión
val listaNumeros = numeros.toList() // Convierte el array en una lista
println(listaNumeros.toString()) // Imprime la lista como una cadena
```

## Conjuntos de datos
Los conjuntos de datos en Kotlin son colecciones no ordenadas y sin duplicados de valores del mismo tipo. Se definen utilizando la palabra clave ``setOf`` o el constructor ``mutableSetOf``.

### Declaración de conjuntos
* ``setOff``

```kt
val colores = setOf("Rojo", "Verde", "Azul")
val animales = setOf("Perro", "Gato", "Conejo")
```

* ``mutableSetOf``

```kt
val numerosPares = mutableSetOf(2, 4, 6, 8)
val nombresCiudades = mutableSetOf("Madrid", "Barcelona", "Valencia")
```

### Métodos de conjuntos de datos

```kt
val colores = mutableSetOf("Rojo", "Verde", "Azul")

// Añadir y eliminar elementos
colores.add("Morado") // Añade "Morado" si no existe
colores.remove("Amarillo") // Elimina "Amarillo" si está presente

// Comprobar elementos
println(colores.contains("Azul")) // Imprime true
println(colores.isEmpty()) // Imprime false

// Recorrido y operaciones
colores.forEach { println(it) } // Imprime cada color en una nueva línea
val coloresPares = colores.filter { it.length % 2 == 0 } // Filtra colores con longitud par

// Conversión
val listaColores = colores.toList() // Convierte el conjunto en una lista
println(listaColores.toString()) // Imprime la lista como una cadena

```

# Listas en Kotlin
Las listas en Kotlin son colecciones ordenadas y de tamaño variable. Se pueden declarar utilizando listOf para listas inmutables y mutableListOf para listas mutables.

## Declaración
```kt
// listOf
val numeros = listOf(1, 2, 3, 4, 5)
val nombres = listOf("Juan", "Ana", "Pedro", "María")

// mutableListOf
val frutas = mutableListOf("Manzana", "Plátano", "Naranja")
val paises = mutableListOf<String>() // Lista vacía, se pueden agregar elementos más tarde
```

## Acceso a elementos
Los elementos de una lista se acceden utilizando su índice entre corchetes []. El índice comienza en 0.

```kt
println(numeros[2]) // Imprime el valor en la posición 2 (que es 3)
println(nombres[1].uppercase()) // Imprime el nombre en la posición 1 en mayúsculas
```

## Modificación de elementos
Los elementos de una lista se pueden modificar asignando un nuevo valor a la posición correspondiente.

```kt
numeros[0] = 10 // Cambia el valor en la posición 0 a 10
nombres[3] = "Laura" // Cambia el nombre en la posición 3 a "Laura"
```

## Métodos de listas

```kt
val numeros = listOf(1, 5, 2, 4, 3)

// Acceso a elementos
println(numeros[2]) // Imprime: 2
numeros[0] = 10 // ¡ERROR! Las listas inmutables no permiten modificación

// Tamaño y rango
println(numeros.size) // Imprime: 5
println(numeros.contains(7)) // Imprime: false

// Recorrido y transformación
numeros.forEach { println(it) } // Imprime cada elemento en una nueva línea
val cuadrados = numeros.map { it * it } // Crea una nueva lista con los cuadrados de cada elemento

// Modificación
val listaOrdenada = numeros.sorted() // Devuelve una nueva lista ordenada
val listaInvertida = numeros.reversed() // Devuelve una nueva lista con los elementos en orden inverso

// Conversión
val arrayNumeros = numeros.toTypedArray() // Convierte la lista en un array
println(arrayNumeros.contentToString()) // Imprime el array como una cadena
```