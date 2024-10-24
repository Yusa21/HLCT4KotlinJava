package Kotlin.Act14

class Videojuego(val titulo: String,
                 val plataforma: String?,
                 val horasJugadas: Double) {

    override fun toString(): String {
        return "Titulo: " + titulo + '\n' +
                "Plataforma: " + plataforma + '\n' +
                "Horas jugadas: " + horasJugadas
    }
}
