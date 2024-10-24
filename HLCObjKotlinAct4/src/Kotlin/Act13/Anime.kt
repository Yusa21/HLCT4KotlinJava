package Kotlin.Act13

class Anime(val nombre: String?,
            val episodios: Int,
            val genero: String?) {

    override fun toString(): String {
        return (nombre + "\n" +
                "Numero de episodios: " + episodios + "\n"
                + "Genero: " + genero)
    }
}
