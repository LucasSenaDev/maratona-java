package academy.devdojo.maratonajava.exerciciosdoguia.exercicio016;

import java.util.Scanner;

public class Exercicio016 {
    /*
    Faça um algoritmo que leia três valores que
    representam os três lados de um triângulo e
    verifique se são válidos, determine se o
    equilátero, isósceles ou escaleno
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] triangulo = new int[3];
        triangulo[0] = sc.nextInt();
        triangulo[1] = sc.nextInt();
        triangulo[2] = sc.nextInt();

        int maior = triangulo[0];

        for(int i = 0; i < triangulo.length; i++) {
            if((i + 1) < triangulo.length) {
                if((triangulo[i] - triangulo[i+1]) <= 0) {
                    maior = triangulo[i+1];
                }
            }
        }

        int soma = 0;
        for(int i = 0; i < triangulo.length; i++) {
            if(triangulo[i] <= maior) {
                soma += triangulo[i];
            }
        }

        if(soma <= maior) {
            System.out.println("Não é um triângulo");
        } else {
            for(int i = 0; i < triangulo.length; i++) {
                if(triangulo[0] == triangulo[1] && triangulo[0] == triangulo[2]) {
                    System.out.println("O triângulo é equilátero");
                    break;
                } else if(triangulo[i] == triangulo[i+1] && (i+1) < triangulo.length) {
                    System.out.println("O triângulo é isosceles");
                    break;
                } else {
                    System.out.println("O triângulo é escaleno");
                    break;
                }
            }
        }


        sc.close();
    }
}
