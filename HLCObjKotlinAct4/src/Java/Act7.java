package Java;

import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        String cadena;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();

        char[] charArray = cadena.toCharArray();
        for(int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
