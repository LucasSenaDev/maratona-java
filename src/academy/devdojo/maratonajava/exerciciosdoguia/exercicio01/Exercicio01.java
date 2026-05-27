package academy.devdojo.maratonajava.exerciciosdoguia.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //ler os valores de A, B e C
        //imprimir na tela a soma de A e B
        //imprimir se a soma de A e B é menor que C
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Escreva A, B e C:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int soma = A + B;

        System.out.println("Soma de A + B: " + soma);
        if(soma < C) {
            System.out.println("A soma de A e B (" + soma + ") é menor que que C (" + C + ")");
        } else {
            System.out.println("A soma de A e B (" + soma + ") é maior que que C (" + C + ")");
        }

        sc.close();
    }
}
