package academy.devdojo.maratonajava.exerciciosdoguia.exercicio023;

import java.util.Scanner;

public class Exercicio023 {
    /*
    Faça um algoritmo que efetue o cálculo do
    salário líquido de um professor. As informações
    fornecidas serão: valor da hora, quantos horas por aula, número de
    aulas lecionadas no mês e percentual de desconto
    do INSS. Imprima na tela o salário líquido final
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da hora trabalhada:");
        double valorHora = sc.nextDouble();
        System.out.println("Quantidade de horas que dura uma aula:");
        double horasPorAula = sc.nextInt();
        System.out.println("Qauntidade de aulas que faz em um mês:");
        int aulasNoMes = sc.nextInt();
        double salarioBruto = valorHora * horasPorAula * aulasNoMes;
        //double salarioBruto = 15000;
        double salarioLiquido = 0;
        double desconto = 0;

        if(salarioBruto <= 1621.00) {
            desconto = salarioBruto * 0.075;
            salarioLiquido = salarioBruto - desconto;
        } else if(salarioBruto > 1621.00 && salarioBruto <= 2902.84) {
            desconto = 121.58 + ((salarioBruto - 1621.00) * 0.09);
            salarioLiquido = salarioBruto - desconto;
        } else if(salarioBruto > 2902.84 && salarioBruto <= 4354.27) {
            desconto = 121.58 + 115.37 + ((salarioBruto - 2902.84) * 0.12);
            salarioLiquido *= salarioBruto - desconto;
        } else if(salarioBruto > 4354.27 && salarioBruto <= 8475.55) {
            desconto = 121.58 + 115.37 + 174.17 + ((salarioBruto - 4354.27) * 0.14);
            salarioLiquido = salarioBruto - desconto;
        } else if(salarioBruto > 8475.55) {
            desconto = 121.58 + 115.37 + 174.17 + 576.98;
            salarioLiquido = salarioBruto - desconto;
        }
        System.out.printf("Salário líquido de R$ %.2f%n", salarioLiquido);
        sc.close();
    }
}
