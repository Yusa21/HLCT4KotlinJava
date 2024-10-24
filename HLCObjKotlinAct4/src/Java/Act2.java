package Java;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        sc.nextLine();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }

}
