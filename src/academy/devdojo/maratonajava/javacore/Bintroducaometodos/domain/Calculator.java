package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    public int somaDoisNumeros(int a, int b) {
        System.out.println("Iniciando função de soma: ");
        return a + b;

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
    // Desafio1: criar uma calculadora que valida se o número é primo ou não
    // Retornar true se for, false se não for
    public boolean numeroPrimo(int num) {
        int contagem = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                contagem++;
            }
        }
        if(contagem > 2) {
            return false;
        } else {
            return true;
        }

    }

    // Desafio2: Criar uma calculadora que recebe uma lista/array.
    // Retorna a lista *2
    public  int[] dobrarNumerosDaLista(int[] lista) {
        for(int i=0; i<lista.length; i++) {
             lista[i] *= 2;
        }
        return lista;
    }
}
