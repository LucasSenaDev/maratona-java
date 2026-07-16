package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando um funcioário");
    }
}
