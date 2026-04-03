package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class Car {
    public String name;
    public String model;
    public Integer year;

    @Override
    public String toString() {
        return "Name: " + name + ", model: " + model + ", year: " + year;
    }

}
