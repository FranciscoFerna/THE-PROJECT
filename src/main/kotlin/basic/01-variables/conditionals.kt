package basic.`01-variables`

import functions.SCANNER

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: conditionals.kt\
*/

/*
Ejercicio 2: Estructuras Condicionales
Escribe un programa que pida al usuario un número entero y determine si es positivo, negativo o cero.

Ejemplo de salida:
 - Introduce un número: -3
 - El número es negativo.
*/

fun main() {
    print("Introduce un número: ")
    val inputUser: Int = SCANNER.nextInt()

    if (inputUser < 0) {
        println("El número es negativo")
    } else {
        println("El número es positivo")
    }
}