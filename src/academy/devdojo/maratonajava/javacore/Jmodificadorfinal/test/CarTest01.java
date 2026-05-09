package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Car;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Uno;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setNome("kal-el");
        System.out.println(car.BUYER);
        Uno uno = new Uno();
        uno.setName("Arranca asfalto");
        uno.print();
    }
}
