package academy.devdojo.maratonajava.exerciciosdoguia.exercicio019;

public class exercicio019 {
    /*
    Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
     */
    public static void main(String[] args) {
        int multiplicacao = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                multiplicacao = i * j;
                System.out.println(i+"x"+j + " = " + multiplicacao);
            }
            System.out.println();
            System.out.println("--------------");
            System.out.println();
        }
    }
}
