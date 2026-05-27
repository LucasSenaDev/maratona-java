package academy.devdojo.maratonajava.exerciciosdoguia.exercicio018;

import java.util.Scanner;

public class Exercicio018 {
    /*
    Francisco tem 1,10m e cresce 6 centímetros por ano,
    enquanto Sara tem 1,50m e cresce 2 centímetros por ano.
    Faça um algoritmo que calcule e imprima na tela em quantos
    anos serão necessários para que Francisco seja maior que Sara.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fAltura = 1.1;
        double sAltura = 1.5;

        int anos = 0;
        while(fAltura < sAltura) {
            fAltura += 0.06;
            sAltura += 0.02;
            anos++;
        }

        System.out.println("Altura do Francisco é " + fAltura);
        System.out.println("Altura da Sara é " + sAltura);
        System.out.println("Se passou " + anos + " anos para francisco passar a sara");


        sc.close();
    }
}
