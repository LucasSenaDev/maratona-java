package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Employee;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Benson", 5000);
        Developer developer = new Developer("Shiryu", 2000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();

    }
}
