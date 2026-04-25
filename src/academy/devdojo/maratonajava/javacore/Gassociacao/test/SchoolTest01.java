package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("gojo");
        Professor professor3 = new Professor("reylagh");
        Professor[] professors = new Professor[]{professor1, professor2, professor3};
        School school = new School("Segismundo", professors);

        school.print();
    }
}
