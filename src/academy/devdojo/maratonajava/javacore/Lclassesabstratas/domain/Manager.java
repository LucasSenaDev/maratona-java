package academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculeBonus() {
        this.salary = this.salary + this.salary * 0.2;
    }
}
