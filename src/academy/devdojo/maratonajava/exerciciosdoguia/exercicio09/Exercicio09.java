package academy.devdojo.maratonajava.exerciciosdoguia.exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
        calcule o imc de uma pessoa(peso / altura ao quadrado)
        informe de acordo com a tabelo do IMC a condição da pessoa
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com a altura(0.00) e o peso(00.0):");
        double altura = sc.nextDouble();
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);
        if(imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal (parabéns) ");
        } else if(imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if(imc >= 35.0 && imc <= 39.0) {
            System.out.println("Obesidade grau II (severa)");
        } else if(imc >= 40.0) {
            System.out.println("Obesidade grau III (mórbida)");
        }
        System.out.println("IMC: " + imc);

        sc.close();
    }
}
