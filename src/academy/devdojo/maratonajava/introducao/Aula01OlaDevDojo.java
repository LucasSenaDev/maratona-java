package academy.devdojo.maratonajava.introducao;

// isso é um comentário de uma linha
    /*
        isso é um comentário
        de multiplas
        linhas
     */

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class Aula01OlaDevDojo {

    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        Car carB  = new Car();
        carB.year = 1992;
        System.out.println(carB.toString());
    }

}
