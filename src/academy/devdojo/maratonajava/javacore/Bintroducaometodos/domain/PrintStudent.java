package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class PrintStudent {
    public void print(Student student) {
        System.out.println("----------------");
        student.name = "sasuke";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
