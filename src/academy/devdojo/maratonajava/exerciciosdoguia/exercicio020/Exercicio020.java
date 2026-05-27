package academy.devdojo.maratonajava.exerciciosdoguia.exercicio020;

import java.util.Scanner;

public class Exercicio020 {
    /*
    Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int multiplicacao = 0;
        System.out.println("Tabuada do " + numero);
        for(int i = 1; i<= 10; i++) {
            multiplicacao = numero * i;
            System.out.println(numero+"x"+i + " = " +  multiplicacao);
        }

        sc.close();
    }
}
