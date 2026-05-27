package academy.devdojo.maratonajava.exerciciosdoguia.Exercicio014;

import java.util.Scanner;

public class Exercicio014 {
    /*
    Faça um algoritmo que receba um valor A e B,
    e troque o valor de A por B e o valor de B
    por A e imprima na tela os valores.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva A:");
        int A = sc.nextInt();
        System.out.println("Escreva B:");
        int B = sc.nextInt();

        int inversao = A;
        A = B;
        B = inversao;
        System.out.println("A(" + A + ") e B(" + B + ") foram magicamente invertidos WOW" );


        sc.close();
    }
}
