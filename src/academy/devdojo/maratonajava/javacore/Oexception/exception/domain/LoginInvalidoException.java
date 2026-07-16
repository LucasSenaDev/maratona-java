package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.IOException;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
