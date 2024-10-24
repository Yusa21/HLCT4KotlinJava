package Java;

import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fb1=0,fb2=1,fbAux;
        System.out.println("Cuantos numeros de la secuencia Fibbonaci quieres");
        n=sc.nextInt();
        sc.nextLine();
        if(n==0){
          System.out.println(fb1);
        }else if(n==1){
            System.out.println(fb2);
        }else{
            System.out.print(fb1 + " " + fb2 + " ");
            for(int i = 2; i <= n; i++){
                fbAux=fb1+fb2;
                System.out.print(fbAux + " ");
                fb1=fb2;
                fb2=fbAux;
            }

        }
    }
}
