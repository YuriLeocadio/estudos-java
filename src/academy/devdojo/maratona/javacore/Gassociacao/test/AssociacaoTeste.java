package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Shibuya, Japão");
        Aluno aluno = new Aluno("Tanjiro", 16);
        Professor professor = new Professor("Giyu", "Hashira");

        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Treinamento dos hashiras", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimi();
    }
}
