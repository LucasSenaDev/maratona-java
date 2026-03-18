package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Uno";
        car1.model = "Fiat";
        car1.year = 2002;
        car2.name = "Fusca";
        car2.model = "Wolkswagen";
        car2.year = 1982;

        car1 = car2;

        System.out.println(car1.toString());
        System.out.println(car2.toString());

    }
}
