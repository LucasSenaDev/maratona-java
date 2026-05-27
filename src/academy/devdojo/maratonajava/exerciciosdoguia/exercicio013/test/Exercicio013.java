package academy.devdojo.maratonajava.exerciciosdoguia.exercicio013.test;

import academy.devdojo.maratonajava.exerciciosdoguia.exercicio013.domain.Pessoa;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        /*
        Faça algoritmo que leia o nome e a idade de uma pessoa
        e imprima na tela o nome da pessoa e se ela é maior
        ou menor de idade.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);


        pessoa.imprimi();

        sc.close();
    }
}
