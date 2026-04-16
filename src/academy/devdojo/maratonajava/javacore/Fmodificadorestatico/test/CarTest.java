package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car.setSpeedLimit(180);
        Car car1 = new Car("BMW", 280.0);
        Car car2 = new Car("Mercedes", 275.0);
        Car car3 = new Car("BAudi", 290.0);

        car1.print();
        car2.print();
        car3.print();
    }
}
