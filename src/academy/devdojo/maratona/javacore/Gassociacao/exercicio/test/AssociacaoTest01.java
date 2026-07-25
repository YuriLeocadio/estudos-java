package academy.devdojo.maratona.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratona.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratona.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.exercicio.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        System.out.println("Sistema de gerenciamento de seminários");
        System.out.println("----------------------------------------");

        Aluno aluno1 = new Aluno("Yuji Itadori", 20);
        Aluno aluno2 = new Aluno("Megumi Fushiguro", 22);
        Aluno aluno3 = new Aluno("Nobara Kugisaki", 21);
        Aluno[] estudantes = {aluno1, aluno2, aluno3};

        Professor professor1 = new Professor("Satoru Gojo", "Jujutsu");
        Professor professor2 = new Professor("Sukuna", "Maldição");

        Seminario seminario1 = new Seminario("Jujutsu Kaisen", professor1, new Local("Tokyo, Japão"));
        Seminario seminario2 = new Seminario("Expansão de domínio", professor1, estudantes, new Local("Osaka, Japão"));
        Seminario seminario3 = new Seminario("Maldições", professor2, estudantes, new Local("Kyoto, Japão"));

        seminario1.imprimir();
        seminario2.imprimir();
        seminario3.imprimir();
    }
}
