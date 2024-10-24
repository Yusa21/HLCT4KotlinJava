package Java;

import java.util.Scanner;

public class Act12 {
    public static void main(String[] args) {
        int n,reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero");
        n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        System.out.println(reverse);

    }
}
