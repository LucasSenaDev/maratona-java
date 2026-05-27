package academy.devdojo.maratonajava.exerciciosdoguia.exercicio011;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        /*
        leio o nome de um aluno e quatro notas desse aluno
        imprima o nome do aluno, a média das notas
        se ele for aprovado(média maior oi igual a 70)
        ou reprovado(média abaixo de 70)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do aluno:");
        String nomeDoAluno = sc.nextLine();

        System.out.println("Escreva as quatro notas do aluno:");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        int nota4 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(nomeDoAluno);
        if(media >= 70) {
            System.out.println("Média: " + media);
            System.out.println("APROVADO");
        } else {
            System.out.println("Média: " + media);
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
