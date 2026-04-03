package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

import static academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator.*;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int soma = calculator.somaDoisNumeros(10, 20);
        System.out.println(soma);
        System.out.println("Finalizando CalculatorTest01");
        System.out.println("-------------------");

        boolean primo = calculator.numeroPrimo(12);
        System.out.println(primo);
        System.out.println("-------------------");

        int[] lista = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = calculator.dobrarNumerosDaLista(lista);
        for(int arr: result) {
            System.out.println(arr);
        }
    }
}
