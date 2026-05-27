package academy.devdojo.maratonajava.exerciciosdoguia.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //receber 1 número aleatório
        //imprimir se o númeor é par ou impar
        // imprimir se o número é negativo ou positivo
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int valor = sc.nextInt();

        if((valor % 2) == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        if(valor >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        sc.close();

    }
}
