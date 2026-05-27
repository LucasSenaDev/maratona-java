package academy.devdojo.maratonajava.exerciciosdoguia.exercicio024;

import java.util.Scanner;

public class Exercicio024 {
    /*
     Faça um algoritmo que calcule a quantidade de litros
     de combustível gastos em uma viagem, sabendo que o carro
     faz 12km com um litro. Deve-se fornecer ao usuário o
     tempo que será gasto na viagem a sua velocidade média,
     distância percorrida e a quantidade de litros utilizados
     para fazer a viagem.
            Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Velocidade média na viagem(Km):");
        int velocidade = sc.nextInt();
        System.out.println("tempo que levou a viagem(horas):");
        double tempo = sc.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.printf("Foram usados %.2f litros na viagem%n", litrosUsados);


        sc.close();
    }
}
