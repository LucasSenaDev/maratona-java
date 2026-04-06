package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Mario");
        employee.setAge(33);
        employee.setSalary(new double[]{2100.0, 2200.0, 2000.0});
        employee.print();
    }
}
