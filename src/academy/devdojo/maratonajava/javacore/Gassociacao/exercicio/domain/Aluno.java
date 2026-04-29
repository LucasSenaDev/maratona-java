package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminarioPresente;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminarioPresente) {
        this(nome, idade);
        this.seminarioPresente = seminarioPresente;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(seminarioPresente != null) {
            System.out.println(this.seminarioPresente);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminarioPresente() {
        return seminarioPresente;
    }

    public void setSeminarioPresente(Seminario seminarioPresente) {
        this.seminarioPresente = seminarioPresente;
    }

}
