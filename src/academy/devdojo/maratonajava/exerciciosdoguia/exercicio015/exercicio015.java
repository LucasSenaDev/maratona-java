package academy.devdojo.maratonajava.exerciciosdoguia.exercicio015;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercicio015 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia o ano em que uma pessoa nasceu,
        imprima na tela quantos anos, meses e dias essa pessoa
        ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
         */
        LocalDate data = LocalDate.now();
        DateTimeFormatter explicito = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Que data você nasceu(dd/mm/yyyy):");
        String[] nascimento = sc.nextLine().split("/");
        //String[] nascimento = "28/02/2005".split("/");
        int[] nascimentoInt = new int[nascimento.length];
        for(int i = 0; i < nascimento.length; i++) {
            nascimentoInt[i] = Integer.parseInt(nascimento[i]);
        }

        String[] dataAgora = explicito.format(data).split("/");
        int[] dataInt = new int[dataAgora.length];
        for(int i = 0; i < dataAgora.length; i++) {
            dataInt[i] = Integer.parseInt(dataAgora[i]);
        }

        int ano = dataInt[2] - nascimentoInt[2];
        int mes = dataInt[1] - nascimentoInt[1];
        int dia = dataInt[0] - nascimentoInt[0];

        if(mes < 0) {
            ano -= 1;
            mes += 12;
        }

        if(dia < 0) {
            mes -= 1;
            dia += 30;
        }

        System.out.println("Anos:" + ano +", meses: " + mes + ", dias: " + dia);


        sc.close();
    }
}
