package academy.devdojo.maratonajava.exerciciosdoguia.exercicio021;

import java.util.Random;

public class Exercicio021 {
    /*
    Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
     */
    public static void main(String[] args) {
        int aleatoriedadeAleatoria = new Random().nextInt(101);
        System.out.println(aleatoriedadeAleatoria);
    }
}
