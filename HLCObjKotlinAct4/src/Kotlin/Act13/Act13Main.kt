package Kotlin.Act13


fun main() {
    println("Escribe el nombre de anime")
    var nombre = readln()
        println("Escribe el numero de episodios")
    var episodios: Int = readln().toInt()
            println("Escribe el genero")
    var genero = readln()

        val newAnime = Anime(nombre, episodios, genero)
        println(newAnime)
    }

