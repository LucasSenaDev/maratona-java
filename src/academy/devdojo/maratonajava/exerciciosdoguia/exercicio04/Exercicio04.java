package academy.devdojo.maratonajava.exerciciosdoguia.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //leia um número digitado
        //imprima na tela o número digitado,
        // o número anterior ao digitado
        // e o número posterior ao digitado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        int numAnterior = numero - 1;
        int numPosterior = numero + 1;

        System.out.println("O número digitado é:" + numero);
        System.out.println("O número anterior ao digitado é: " + numAnterior);
        System.out.println("O número posterior ao digitado é: " + numPosterior);

        sc.close();
    }
}
