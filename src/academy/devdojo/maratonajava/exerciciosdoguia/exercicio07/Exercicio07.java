package academy.devdojo.maratonajava.exerciciosdoguia.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        leio 2 valores booleanos(true ou false)
        imprima apenas se ambos forem verdadeiros ou ambos forem falsos
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois valores booleanos(true ou false)");
        boolean um = sc.nextBoolean();
        boolean dois = sc.nextBoolean();

        if(um == true && dois == true) {
            System.out.printf("Os dois valores digitados são true");
        } else if(um == false && dois == false) {
            System.out.printf("Os dois valores digitados são false");
        }

        sc.close();
    }
}
