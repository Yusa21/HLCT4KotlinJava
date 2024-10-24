package Kotlin


fun main() {
    println("Ingrese el radio del círculo")
    val radio = readln().toDouble()
    val area = Math.PI * radio * radio
    println("El area es " + area)
}

