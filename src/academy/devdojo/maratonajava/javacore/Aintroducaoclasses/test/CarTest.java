package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Uno turbinado";
        car1.model = "Fiat UNO";
        car1.year = 2002;

        car2.name = "Up altas aventuras";
        car2.model = "Up TSI";
        car2.year = 2016;

        car1 = car2;

        System.out.println(car1);
        System.out.println("-----------");
        System.out.println(car2);
    }


}
