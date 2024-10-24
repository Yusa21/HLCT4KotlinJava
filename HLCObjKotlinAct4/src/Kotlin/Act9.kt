package Kotlin

import kotlin.math.sqrt

fun main() {
    var primo = true
    println("Introduce un numero")
    val num = readln().toInt()
    var i = 2
    while (i <= sqrt(num.toDouble())) {
        if (num % i == 0) {
            println("$num no es primo su primer divisor es $i")
            primo = false
            break
        }
        i++
    }
    if (primo) {
        println("$num es primo")
    }
}

