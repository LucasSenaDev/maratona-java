package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("234567-ta na hora");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(("Uma thurman"));
        pessoa.setCpf("2039434");
        pessoa.setEndereco(endereco);
        pessoa.imprimi();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Togashi");
        funcionario.setCpf("234234");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200001);

        System.out.println("------------------");
        funcionario.imprimi();
        funcionario.relatorioPagamento();
    }
}
