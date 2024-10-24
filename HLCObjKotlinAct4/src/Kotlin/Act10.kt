package Kotlin

    fun main() {
        var cel: Double
        var fan: Double
        println(
            "Formato de la temperatura? \n" +
                    "1.Celsius\n" +
                    "2.Fahrenheit"
        )
        var op: Int = readln().toInt()
        if (op == 1) {
            println("Escribe la temperatura el Celsius")
            cel = readln().toDouble()
            fan = cel * 9 / 5 + 32
            println("$fan grados Fanhrenheit")
        } else if (op == 2) {
            println("Escribe la temperatura el Celsius")
            fan = readln().toDouble()
            cel = (fan - 32) * 5 / 9
            println("$fan grados Celsius")
        } else {
            println("Opcion no valida")
        }
    }

