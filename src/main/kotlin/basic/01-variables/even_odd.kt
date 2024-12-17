package basic.`01-variables`

import functions.SCANNER

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: even_odd.kt\
*/

/*
Ejercicio 5: Número Par o Impar
Escribe un programa que pida un número entero y determine si es par o impar.

Ejemplo de salida:
 - Introduce un número: 8
 - El número es par.
*/

fun main () {
    print("Introduce un número: ")
    val numero: Int = SCANNER.nextInt()

    if (numero % 2 == 0) {
        println("El número es par")
    } else {
        println("El número es impar")
    }
}