package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.PrintStudent;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Ichigo";
        student01.age = 20;
        student01.sex = 'M';

        student02.name = "Gon";
        student02.age = 12;
        student02.sex = 'M';

        student01.print();
        student02.print();
    }
}
