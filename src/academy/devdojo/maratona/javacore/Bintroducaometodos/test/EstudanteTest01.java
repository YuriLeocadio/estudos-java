package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Itadori";
        estudante01.idade = 100;
        estudante01.sexo = 'M';

        estudante02.nome = "Sukuna";
        estudante02.idade = 1000;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("#####################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
