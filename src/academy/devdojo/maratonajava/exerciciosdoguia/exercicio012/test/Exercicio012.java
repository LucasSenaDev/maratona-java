package academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.test;

import academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain.ContaAPagar;
import academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain.FormaDePagamento;
import academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain.Produto;

import java.util.Scanner;

import static academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain.FormaDePagamento.CREDITO;
import static academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain.FormaDePagamento.PARCELADOMAIS;

public class Exercicio012 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

 Tabela de Código de Condições de Pagamento
 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
         */

        Produto produto1 = new Produto("Arroz", 32.0, 1);
        Produto produto2 = new Produto("refrigerante", 8.0, 3);
        Produto produto3 = new Produto("Café", 11.0, 2);

        Produto[] produtos = {produto1, produto2, produto3};
        FormaDePagamento formaDePagamento = PARCELADOMAIS;
        int parcelas = 12;

        ContaAPagar contaAPagar = new ContaAPagar(produtos, formaDePagamento, parcelas);

        System.out.println(contaAPagar.totalAPagar(produtos));

    }
}
