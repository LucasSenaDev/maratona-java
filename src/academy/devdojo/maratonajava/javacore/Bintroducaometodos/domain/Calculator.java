package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }
    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }
    public double divideDoisNumeros(double a, double b) {
        if(b == 0) {
            return 0;
        }
        return a / b;
    }
    public double divideDoisNumeros2(double a, double b) {
        if(b != 0) {
            return a / b;
        }
        return 0;

    }
    public void imprimiDoisNumeors(double a, double b) {
        if(b == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(a/b);
    }
    public void alteraDoisNumero(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("a: " + numero1);
        System.out.println("b: " + numero2);
    }
}
