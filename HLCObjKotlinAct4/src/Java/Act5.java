package Java;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para hacer la tabla de multiplicar: ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= 100; i++){
            System.out.printf("%d * %d = %d%n", n, i, n*i);
        }
    }
}
