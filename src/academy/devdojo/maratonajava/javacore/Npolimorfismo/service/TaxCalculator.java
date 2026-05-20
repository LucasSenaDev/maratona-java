package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {

    public static void CalculateTax(Product product) {
        System.out.println("Tax report");
        double tax = product.calculeTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Value: " + product.getValue());
        System.out.println("Tax to be paid: " + tax);
        if(product instanceof Tomato) {
            System.out.println(((Tomato) product).getExpirationDate());
        }
    }
}
