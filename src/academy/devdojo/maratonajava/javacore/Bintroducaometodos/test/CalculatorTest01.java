package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.somaDoisNumeros();
        calculator.subtraiDoisNumeros();
        System.out.println("Finalizando CalculatorTest01");
    }
}
