package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Lucas";
        student.age = 21;
        student.sex = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);
    }
}
