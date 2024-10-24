package Java.Act14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act14Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Videojuego> videojuegos = new ArrayList<>();
        boolean salir = false;
        int op;

        do {
            System.out.println("\nQue quieres hacer:\n" +
                    "1. Añadir un juego\n" +
                    "2. Borrar un juego\n" +
                    "3. Listar tus juegos\n" +
                    "4. Salir");

            op = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch(op) {
                case 1:
                    anadirVideojuego(videojuegos, sc);
                    break;
                case 2:
                    System.out.println("Introduce el título del juego a eliminar:");
                    String titulo = sc.nextLine();
                    eliminarVideojuego(videojuegos, titulo);
                    break;
                case 3:
                    listarVideojuegos(videojuegos);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(!salir);

        sc.close();
    }

    public static void anadirVideojuego(List<Videojuego> videojuegos, Scanner sc) {
        System.out.println("Escribe el título del videojuego:");
        String titulo = sc.nextLine();
        System.out.println("Escribe la plataforma del juego:");
        String plataforma = sc.nextLine();
        System.out.println("Escribe el número de horas jugadas:");
        int horas = sc.nextInt();
        sc.nextLine();

        videojuegos.add(new Videojuego(titulo, plataforma, horas));
        System.out.println("Juego añadido correctamente");
    }

    public static void eliminarVideojuego(List<Videojuego> videojuegos, String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                videojuegos.remove(i);
                encontrado = true;
                System.out.println("Juego eliminado correctamente");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el juego");
        }
    }

    public static void listarVideojuegos(List<Videojuego> videojuegos) {
        if (videojuegos.isEmpty()) {
            System.out.println("No hay juegos en la lista");
            return;
        }
        System.out.println("\nLista de videojuegos:");
        for (Videojuego juego : videojuegos) {
            System.out.println(juego.toString());
            System.out.println();
        }
    }
}