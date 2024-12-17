package basic.`01-variables`

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: variables.kt\
*/

/*
Ejercicio 1: Declaración de Variables
Crea un programa que declare variables de diferentes tipos de datos:

Int, Double, String, Boolean
Asigna valores a cada variable y muestra su contenido por pantalla.

Ejemplo de salida:
 - Número entero: 10
 - Número decimal: 5.5
 - Texto: Hola, Kotlin!
 - Booleano: true
*/

fun main() {
    val numeroEntero: Int = 18
    val numeroDecimal: Double = 1.78
    val textString: String = "Hello, Kotlin!"
    val isStudent: Boolean = true

    println("Número entero: $numeroEntero")
    println("Número decimal: $numeroDecimal")
    println("Texto: $textString")
    println("Booleano: $isStudent")
}