package academy.devdojo.maratonajava.exerciciosdoguia.exercicio08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        leio 2 valores
        escreva os valores em ordem decrescente
         */

        Scanner sc = new Scanner(System.in);
        int[] valor = new int[3];

        System.out.printf("Entre com os valores A, B e C:");

        valor[0] = sc.nextInt();
        valor[1] = sc.nextInt();
        valor[2] = sc.nextInt();

        int menor = 0, meio = 0, maior = 0;
        if(valor[0] > valor[1] && valor[0] > valor[2]) {
            maior = valor[0];
            if(valor[1] > valor[2]) {
                meio = valor[1];
                menor = valor[2];
            } else {
                meio = valor[2];
                menor = valor[1];
            }
        } else if(valor[1] > valor[0] && valor[1] > valor[2]){
            maior = valor[1];
            if(valor[0] > valor[2]) {
                meio = valor[0];
                menor = valor[2];
            } else {
                meio = valor[2];
                menor = valor[1];
            }
        } else if(valor[2] > valor[0] && valor[2] > valor[1]) {
            maior = valor[2];
            if(valor[0] > valor[1]) {
                meio = valor[0];
                menor = valor[1];
            } else {
                meio = valor[1];
                menor = valor[0];
            }
        }
        System.out.println("menor:" + menor);
        System.out.println("meio:" + meio);
        System.out.println("maior:" + maior);


        sc.close();
    }
}
