package Kotlin.Act14


    fun main() {
        val videojuegos: MutableList<Videojuego> = ArrayList<Videojuego>()
        var salir = false
        var op: Int

        do {
            println(
                "\nQue quieres hacer:\n" +
                        "1. Añadir un juego\n" +
                        "2. Borrar un juego\n" +
                        "3. Listar tus juegos\n" +
                        "4. Salir"
            )

            op = readln().toInt()

            when (op) {
                1 -> anadirVideojuego(videojuegos)
                2 -> {
                    println("Introduce el título del juego a eliminar:")
                    val titulo = readln()
                    eliminarVideojuego(videojuegos, titulo)
                }

                3 -> listarVideojuegos(videojuegos)
                4 -> salir = true
                else -> println("Opción no válida")
            }
        } while (!salir)
    }

    fun anadirVideojuego(videojuegos: MutableList<Videojuego>) {
        println("Escribe el título del videojuego:")
        val titulo = readln()
        println("Escribe la plataforma del juego:")
        val plataforma = readln()
        println("Escribe el número de horas jugadas:")
        val horas = readln()

        videojuegos.add(Videojuego(titulo, plataforma, horas.toDouble()))
        println("Juego añadido correctamente")
    }

    fun eliminarVideojuego(videojuegos: MutableList<Videojuego>, titulo: String) {
        var encontrado = false
        for (i in videojuegos.indices) {
            if (videojuegos[i].titulo.equals(titulo, ignoreCase = true)) {
                videojuegos.removeAt(i)
                encontrado = true
                println("Juego eliminado correctamente")
                break
            }
        }
        if (!encontrado) {
            println("No se encontró el juego")
        }
    }

    fun listarVideojuegos(videojuegos: MutableList<Videojuego>) {
        if (videojuegos.isEmpty()) {
            println("No hay juegos en la lista")
            return
        }
        println("\nLista de videojuegos:")
        for (juego in videojuegos) {
            println(juego.toString())
            println()
        }
    }
