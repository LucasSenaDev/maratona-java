package academy.devdojo.maratonajava.exerciciosdoguia.exercicio017;

import java.util.Scanner;

public class Exercicio017 {
    /*
    Faça um algoritmo que leia uma temperatura em Fahrenheit
     e calcule a temperatura correspondente em grau Celsius.
     Imprima na tela as duas temperaturas.
     Fórmula: C = (5 * ( F-32) / 9)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura = sc.nextDouble();

        double celsius = (5 * (temperatura - 32) / 9);

        System.out.printf("Temperatura em Fahrenheit %.1f%n" , temperatura);
        System.out.printf("Temperatura em Celsius %.1f%n", celsius);

        sc.close();
    }
}
