package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Car {
    private String name;
    private double speedMax;
    public static double speedLimit = 250;

    public Car(String name, double speedMax) {
        this.name = name;
        this.speedMax = speedMax;
    }

    public void print() {
        System.out.println("-------------------");
        System.out.println("Nome " + this.name);
        System.out.println("Velocidade máxima " + this.speedMax);
        System.out.println("Velocidade limite " + Car.speedLimit);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(double speedMax) {
        this.speedMax = speedMax;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }
}
