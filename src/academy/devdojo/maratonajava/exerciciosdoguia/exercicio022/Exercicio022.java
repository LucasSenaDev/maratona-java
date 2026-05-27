package exercicio022;

import java.util.Scanner;

public class Exercicio022 {
    /*
    Faça um algoritmo que leia dois valores
    inteiros A e B, imprima na tela o quociente
     e o resto da divisão inteira entre eles.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int quociente = A / B;
        int resto = A % B;

        System.out.println("quociente: " + quociente);
        System.out.println("resto: " + resto);

        sc.close();
    }
}
