package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideDoisNumeros(10.0, 5.0);
        System.out.println(result);
        System.out.println(calculator.divideDoisNumeros(3.0, 0.0));
        System.out.println("--------------");
        calculator.imprimiDoisNumeors(86, 0);
    }
}
