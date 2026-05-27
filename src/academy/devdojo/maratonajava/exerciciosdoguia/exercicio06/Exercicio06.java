package academy.devdojo.maratonajava.exerciciosdoguia.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        leia um valor digitado pelo usuário
        imprima o valor com um reajuste de 5%
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        valor *= 1.05;

        System.out.println("O valor digita com reajusto de 5% é:" + valor);


        sc.close();
    }
}
