package academy.devdojo.maratonajava.exerciciosdoguia.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //ler os valores A e B
        //se os valores A e B forem iguais, deve somar e mostrar eles
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os valores A e B:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int soma = 0;

        if(A == B) {
            soma = A + B;
            System.out.println("A soma de A + B qunado eles são iguais é: " + soma);
        } else {
            System.out.println("Os valores A ("+A+") e B ("+B+"), não são iguais");
        }


        sc.close();
    }


}
