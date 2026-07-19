package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Zantetsu";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{5000, 3000, 7000};
        funcionario.imprime();
    }
}