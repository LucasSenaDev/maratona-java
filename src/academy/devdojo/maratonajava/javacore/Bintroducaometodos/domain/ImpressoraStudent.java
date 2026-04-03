package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImpressoraStudent {
    public void imprimi(Student student) {
        System.out.println("--------------------");

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);

        student.name = "Gohan";
    }
}
