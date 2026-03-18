package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraStudent;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        ImpressoraStudent impressora = new ImpressoraStudent();

        student1.name = "Gon";
        student1.age = 12;
        student1.sex = 'M';

        student2.name = "Naruto";
        student2.age = 16;
        student2.sex = 'M';

        impressora.imprimi(student1);

        impressora.imprimi(student2);
    }
}
