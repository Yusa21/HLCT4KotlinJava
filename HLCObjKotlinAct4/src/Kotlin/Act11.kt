package Kotlin


fun main() {
    var fb1 = 0
    var fb2 = 1
    var fbAux: Int
    println("Cuantos numeros de la secuencia Fibbonaci quieres")
    var n: Int = readln().toInt()
    if (n == 0) {
        println(fb1)
    } else if (n == 1) {
        println(fb2)
    } else {
        print("$fb1 $fb2 ")
        for (i in 2..n) {
            fbAux = fb1 + fb2
            print("$fbAux ")
            fb1 = fb2
            fb2 = fbAux
        }
    }
}

