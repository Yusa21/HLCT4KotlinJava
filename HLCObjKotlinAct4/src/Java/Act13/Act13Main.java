package Java.Act13;

import java.util.Scanner;

public class Act13Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,genero;
        int episodios;
        System.out.println("Escribe el nombre de anime");
        nombre = sc.nextLine();
        System.out.println("Escribe el numero de episodios");
        episodios = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe el genero");
        genero = sc.nextLine();

        Anime newAnime = new Anime(nombre,episodios,genero);
        System.out.println(newAnime);

    }
}
