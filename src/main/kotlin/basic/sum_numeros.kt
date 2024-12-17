package basic.`01-variables`

import functions.SCANNER

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: sum_numeros.kt\
*/

/*
Ejercicio 4: Suma de Números
Crea un programa que pida al usuario dos números enteros, los sume y muestre el resultado.

Ejemplo de salida:
 - Introduce el primer número: 4
 - Introduce el segundo número: 5
 - La suma es: 9
*/

fun main() {
    print("Introduce el primer número: ")
    val firstValor: Int = SCANNER.nextInt()
    print("Introduce el segundo número: ")
    val secondValor: Int = SCANNER.nextInt()

    val resultatSuma: Int = firstValor + secondValor
    println("La suma es: $resultatSuma")
}