package academy.devdojo.maratonajava.exerciciosdoguia.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        //leia o valor de um salário de um usuário
        //Calcule quantos salários minimos esse usuário ganha
        //salário minimo = 1.293,20
        Scanner sc = new Scanner(System.in);
        final double SALARIO_MINIMO = 1293.20;

        System.out.println("Digite o seu salário:");
        double salario = sc.nextDouble();

        double calculo = salario / SALARIO_MINIMO;

        System.out.printf("A quantidade de salários mínimos que seu salário tem é %.2f%n", calculo);

        sc.close();
    }
}
