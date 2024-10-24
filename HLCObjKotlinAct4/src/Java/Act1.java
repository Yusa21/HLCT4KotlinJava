package Java;

import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre usuario: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
        sc.close();
    }
}