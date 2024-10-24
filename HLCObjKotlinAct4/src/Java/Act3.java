package Java;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        double radio = sc.nextDouble();
        sc.nextLine();
        double area = Math.PI * radio * radio;
        System.out.println("El area es "+area);

    }
}
