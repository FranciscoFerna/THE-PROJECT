package projects.`01-number-game`

import functions.*

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: 01-number-game\main.kt\
*/

/*
📂 project-01-number-game
Descripción del Proyecto
Vamos a desarrollar un juego sencillo en Kotlin donde:

 - El programa genera un número aleatorio entre 1 y 10.
 - El usuario tiene 3 intentos para adivinar el número.
 - El programa da pistas si el número es mayor o menor que la suposición.
 - Al final, el programa indica si el usuario ha ganado o perdido.
*/

fun main() {
    // Generamos el numero aleatorio
    val numeroAleatorio : Int = generarNumero()
    // Intentos del usuario
    val attempts: Int = 3

    when (menuNumberGame()) {
        1 -> jugarJuego(numeroAleatorio, attempts)
    }
}