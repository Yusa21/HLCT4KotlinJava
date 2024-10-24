package Kotlin


fun main() {
    var n: Int
    println("Ingrese el numero para hacer la tabla de multiplicar: ")
    n = readln().toInt()
    for (i in 1..100) {
        System.out.printf("$n * $i = ${n*i}")
    }
}

