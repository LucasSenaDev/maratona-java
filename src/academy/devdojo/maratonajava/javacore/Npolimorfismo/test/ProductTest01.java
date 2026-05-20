package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("PC da nasa", 12000);
        Tomato tomato = new Tomato("Tomate cereja", 20);
        Television tv = new Television("Samsung 50\"", 5000);

        TaxCalculator.CalculateTax(computer);
        System.out.println("-------------------");
        TaxCalculator.CalculateTax(tomato);
        System.out.println("-------------------");
        TaxCalculator.CalculateTax(tv);
    }
}
