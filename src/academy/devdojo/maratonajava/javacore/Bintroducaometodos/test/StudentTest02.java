package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Gon";
        student1.age = 12;
        student1.sex = 'M';

        student2.name = "Naruto";
        student2.age = 16;
        student2.sex = 'M';

        student1.imprime();
         student2.imprime();
    }
}
