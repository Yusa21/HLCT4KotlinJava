package Kotlin


fun main() {
    var cadena: String
    println("Introduce una cadena")
    cadena = readln()

    val charArray = cadena.toCharArray()
    println(charArray.indices.reversed())
    for (i in charArray.indices.reversed()) {
        print(charArray[i])
    }
}

