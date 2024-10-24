package Java;

import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double cel,fan;
        System.out.println("Formato de la temperatura? \n" +
                "1.Celsius\n" +
                "2.Fahrenheit");
        op = sc.nextInt();
        sc.nextLine();
        if (op == 1) {
            System.out.println("Escribe la temperatura el Celsius");
            cel = sc.nextDouble();
            fan = cel * 9/5 + 32;
            System.out.println(fan + " grados Fanhrenheit");
        }else if(op == 2) {
            System.out.println("Escribe la temperatura el Celsius");
            fan = sc.nextDouble();
            cel = (fan - 32) * 5/9;
            System.out.println(fan + " grados Celsius");
        }else{
            System.out.println("Opcion no valida");
        }

    }
}
