package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product1 = new Computer("PC da Xuxa", 2000);

        Tomato tomato = new Tomato("Tomate vermelho", 100);
        tomato.setExpirationDate("12/12/2026");
        TaxCalculator.CalculateTax(tomato);
        System.out.println("-------------------");
        TaxCalculator.CalculateTax(product1);
    }

}
