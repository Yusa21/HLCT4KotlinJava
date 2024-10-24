package Kotlin

fun main() {
    var numVoc = 0
    println("Introduce una cadena")
    var cadena: String = readln()

    val charArray = cadena.toCharArray()
    for (i in 0..(charArray.size - 1)) {
        if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'o' || charArray[i] == 'i' || charArray[i] == 'u') {
            numVoc++
        }
    }
    println("Hay $numVoc vocales")
}

