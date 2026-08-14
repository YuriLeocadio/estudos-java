package academy.devdojo.maratona.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionário");
    }
}
