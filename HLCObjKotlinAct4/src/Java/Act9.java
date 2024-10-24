package Java;

import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = true;
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        sc.nextLine();
        for(int i=2; i <= Math.sqrt(num); i++ ){
            if(num % i == 0){
                System.out.println(num +" no es primo su primer divisor es " + i);
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println(num + " es primo");
        }

    }
}
