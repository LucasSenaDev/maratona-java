package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminariosAdministrados;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminariosAdministrados) {
        this(nome, especialidade);
        this.seminariosAdministrados = seminariosAdministrados;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if(seminariosAdministrados != null) {
            System.out.println("Seminários do professor:");
            for(Seminario arrSeminarios: seminariosAdministrados) {
                System.out.println(arrSeminarios.getTitulo());
                System.out.println(arrSeminarios.getLocal().getEndereco());
                if(arrSeminarios.getAlunos() != null) {
                    System.out.println("Alunos:");;
                    for(Aluno aluno: arrSeminarios.getAlunos()) {
                        System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
                    }
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminariosAdministrados() {
        return seminariosAdministrados;
    }

    public void setSeminariosAdministrados(Seminario[] seminariosAdministrados) {
        this.seminariosAdministrados = seminariosAdministrados;
    }
}
