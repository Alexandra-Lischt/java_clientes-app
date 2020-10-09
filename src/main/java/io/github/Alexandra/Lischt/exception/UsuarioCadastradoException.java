package io.github.Alexandra.Lischt.exception;


public class UsuarioCadastradoException extends RuntimeException {
    public UsuarioCadastradoException(String login){
        super("Usuário já cadastrado para login " + login);
    }
}
