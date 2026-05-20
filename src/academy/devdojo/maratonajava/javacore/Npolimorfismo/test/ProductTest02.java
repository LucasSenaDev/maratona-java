package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("PC da Xuxa", 2000);
        System.out.println(product1.getName());
        System.out.println(product1.getValue());
        System.out.println(product1.calculeTax());
        System.out.println("-------------");
        Product product2 = new Tomato("Tomate vermelho", 100);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculeTax());

    }

}
