package functions

import java.util.*

/*
@author: Francisco Fernandez Navarro
#date: 17 de Diciembre de 2024
%file: functions.kt\
*/

val SCANNER: Scanner = Scanner(System.`in`)

// 01-number-game -> Functions
fun generarNumero(): Int {
    return (1..10).random()
}
fun escogerOpcion(menuGame:String, pMessage: String, pMessageError: String): Int {
    var inputUser: Int = 0
    do {
        println(menuGame)
        print(pMessage)
        if (SCANNER.hasNextInt()) {
            inputUser = SCANNER.nextInt()
            if (inputUser !in 1..2) {
                println(pMessageError)
            } else {
                return inputUser
            }
        } else {
            println(pMessageError)
            SCANNER.next()
        }
    } while (true)
}
fun menuNumberGame(): Int {
    val MENU_TEXT = """
        ╔══════════════════════════════════════════╗
        ║   🎮 BIENVENIDO AL JUEGO DE ADIVINAR 🎮  ║
        ╠══════════════════════════════════════════╣
        ║  📌 Objetivo:                            ║
        ║    Adivina el número secreto entre 1-10  ║
        ║    Tienes 3 intentos para acertarlo.     ║
        ╠══════════════════════════════════════════╣
        ║  🕹️ Opciones:                            ║
        ║    1. Iniciar el juego                   ║
        ║    2. Salir                              ║
        ╚══════════════════════════════════════════╝
    """.trimIndent()
    val optionUser: Int = escogerOpcion(MENU_TEXT, "Eliga entre las dos opciones: ", "Por favor el numero que ha introducido no coincide con ninguna opcion en el menu")
    return optionUser
}
fun jugarJuego(numeroAleatorio: Int, attempts: Int) {

}