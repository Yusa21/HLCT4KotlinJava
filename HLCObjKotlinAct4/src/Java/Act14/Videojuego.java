package Java.Act14;

public class Videojuego {
    String titulo;
    String plataforma;
    double horasJugadas;

    public Videojuego(String titulo, String plataforma, double horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setHorasJugadas(double horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo + '\n' +
                "Plataforma: " + plataforma + '\n' +
                "Horas jugadas: " + horasJugadas;
    }
}
