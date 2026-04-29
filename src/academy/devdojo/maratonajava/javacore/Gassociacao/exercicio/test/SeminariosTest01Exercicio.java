package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class SeminariosTest01Exercicio {
    public static void main(String[] args) {
        Local localSeminario = new Local("Rua das mexiricas voadoras");
        Aluno aluno1 = new Aluno("Papacu", 33);
        Aluno aluno2 = new Aluno("Leslie Nielson", 71);
        Aluno aluno3 = new Aluno("Cadu", 17);
        Aluno aluno4 = new Aluno("João Frango", 21);
        Aluno[] alunos1 = new Aluno[]{aluno1, aluno2};
        Aluno[] alunos2 = new Aluno[]{aluno3};
        Aluno[] alunos3 = new Aluno[]{aluno4};
        Professor professor1 = new Professor("Robersvaldo", "Sabe de tudo um pouco");
        Professor professor2 = new Professor("Valtin", "Um dia tentaram invadir um sistema dele, ele invadiu o computador dos cara");
        Seminario seminario1 = new Seminario("Comunicação em público", alunos1, localSeminario);
        Seminario seminario2 = new Seminario("CiberSegurança", alunos2, localSeminario);
        Seminario seminario3 = new Seminario("Segurança de trabalho", alunos3, localSeminario);
        Seminario seminariosDoProfessor1[] = new Seminario[]{seminario1, seminario3};
        Seminario seminariosDoProfessor2[] = new Seminario[]{seminario2};
        aluno1.setSeminarioPresente(seminario1);
        aluno2.setSeminarioPresente(seminario1);
        aluno3.setSeminarioPresente(seminario2);
        aluno4.setSeminarioPresente(seminario3);
        professor1.setSeminariosAdministrados(seminariosDoProfessor1);
        professor2.setSeminariosAdministrados(seminariosDoProfessor2);


        System.out.println("-----------");
        seminario3.print();
        System.out.println("-----------");
        for(Seminario arrSeminariosDoProfessor1: seminariosDoProfessor1) {
            System.out.println(arrSeminariosDoProfessor1.getTitulo());
        }
        System.out.println("-----------");
        professor1.print();
        System.out.println("-----------");
        professor2.print();
    }
}
