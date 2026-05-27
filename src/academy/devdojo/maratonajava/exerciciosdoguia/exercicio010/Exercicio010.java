package academy.devdojo.maratonajava.exerciciosdoguia.exercicio010;

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        /*
        leio 3 notas de um aluno
        imprima a média dessas notas
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque as notas do aluno:");

        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
