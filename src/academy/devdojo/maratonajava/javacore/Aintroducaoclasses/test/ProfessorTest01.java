package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Jiraya";
        professor.age = 63;
        professor.sex = 'M';
        System.out.println("name: " + professor.name + ", age: " + professor.age + " ,sex: " + professor.sex);
    }
}
