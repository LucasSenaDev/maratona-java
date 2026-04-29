package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
