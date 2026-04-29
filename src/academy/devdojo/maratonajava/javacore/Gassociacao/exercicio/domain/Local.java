package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Local {
    private String endereco;

    public Local() {
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void print() {
        System.out.println(getEndereco());
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
