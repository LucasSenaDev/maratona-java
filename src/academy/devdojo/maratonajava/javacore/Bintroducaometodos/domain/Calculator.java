package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {

    public void sumTwoNumebrs() {
        System.out.println(10 + 10);
    }
    public void subtractTwoNumbers() {
        System.out.println(10 - 10);
    }
    public void MultipliesTwoNumbers(int a, int b) {
        System.out.println(a * b);
    }
    public double dividesTwoNumbers(double a, double b) {
        if(b == 0) {
            return 0;
        }
        return a / b;
    }
    public void dividesTwoNumbers02(double a, double b) {
        if(b == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(a/b);
    }
    public void changesTwoNumebrs(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("dentro do changesTwoNumbers");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }
    public void sumArray(int[] numbers) {
        int sum = 0;
        for(int arr: numbers) {
            sum += arr;
        }
        System.out.println(sum);
    }
    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for(int arr: numbers) {
            sum += arr;
        }
        System.out.println(sum);
    }
}
