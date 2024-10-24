package Kotlin

fun main() {
    println("Ingrese un numero")
    val num = readln().toInt()
    if (num % 2 == 0) {
        println("El numero es par")
    } else {
        println("El numero es impar")
    }
}
