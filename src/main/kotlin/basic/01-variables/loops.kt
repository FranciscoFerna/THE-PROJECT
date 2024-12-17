package basic.`01-variables`

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: loops.kt\
*/

/*
Ejercicio 3: Bucles (for y while)
Imprime los números del 1 al 10 usando un bucle for.
Imprime los números del 10 al 1 usando un bucle while.

Ejemplo de salida:
Con for:
    - 1 2 3 4 5 6 7 8 9 10

Con while:
    - 10 9 8 7 6 5 4 3 2 1
*/

fun main() {

    // Bucle 'for'
    for (n in 1..10) {
        println(n)
    }

    // Bucle 'while'
    var finalNumber: Int = 10
    var n: Int = 1
    while (n <= finalNumber) {
        println(n)
        n++
    }
}