package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula00ExercicioNeliAlves {
    public static void main(String[] args) {
        //Apenas uma classe para fazer exercícios de outro curso
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.print(i + " ");
            System.out.print(square + " ");
            System.out.println(cube + "");
        }

        sc.close();
    }
}
