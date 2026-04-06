package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void averageSalary() {
        if(salary == null) {
            return;
        }

        for (double salaryCalculation : salary) {
            average += salaryCalculation;
        }
        average /= salary.length;
        System.out.println("\nAverage salary: " + average);
    }


    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if(salary == null) {
            return;
        }
        for (double salarys: salary) {
            System.out.print(salarys + " ");
        }
        averageSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalary() {
        return salary;
    }

    public double getAverage() {
        return average;
    }
}
