package Kotlin

import java.util.Random

fun main() {
    val random = Random()
    val numRandom = random.nextInt(100) + 1
    var tried: Int
    var guessed = false
    do {
        println("Adivina el numero")
        tried = readln().toInt()
        if (tried == numRandom) {
            guessed = true
        } else if (tried < numRandom) {
            println("El numero es más grande")
        } else {
            println("El numero es más pequeño")
        }
    } while (!guessed)
    println("Has adivinado el numero")
}

