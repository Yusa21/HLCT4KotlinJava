package Java;

import java.util.Random;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numRandom = random.nextInt(100) + 1;
        int tried;
        boolean guessed = false;
        do{
            System.out.println("Adivina el numero");
            tried = sc.nextInt();
            sc.nextLine();
            if(tried == numRandom){
                guessed = true;
            }else if(tried < numRandom){
                System.out.println("El numero es más grande");
            }else{
                System.out.println("El numero es más pequeño");
            }
        }while(!guessed);
        System.out.println("Has adivinado el numero");
    }
}
