package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Car {
    public String name;
    public String model;
    public int year;

    @Override
    public String toString() {
        return "name: " + name + "\nmodel: " + model + "\nyear: " + year;
    }
}
