package Java.Act13;

public class Anime {
    String nombre;
    int episodios;
    String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre + "\n" +
                "Numero de episodios: " + episodios + "\n"
                + "Genero: " + genero;
    }

}
