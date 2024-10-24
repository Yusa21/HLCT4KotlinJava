package Kotlin

fun main() {
    var reverse = 0
    println("Escribe un numero entero")
    var n: Int = readln().toInt()
    while (n != 0) {
        reverse = reverse * 10 + n % 10
        n /= 10
    }
    println(reverse)
}

