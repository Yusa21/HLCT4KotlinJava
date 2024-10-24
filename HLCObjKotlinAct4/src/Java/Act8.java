package Java;

import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        String cadena;
        int numVoc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();

        char[] charArray = cadena.toCharArray();
        for(int i = 0; i <= charArray.length-1; i++) {
            if(charArray[i] == 'a' ||
                    charArray[i] == 'e' ||
                    charArray[i] == 'o' ||
                    charArray[i] == 'i' ||
                    charArray[i] == 'u' ) {
                numVoc++;
            }
        }
        System.out.println("Hay "+ numVoc + " vocales");
    }
}
