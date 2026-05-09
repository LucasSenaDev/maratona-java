package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Buyer {
    private String nome;

    @Override
    public String toString() {
        return "Buyer{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
