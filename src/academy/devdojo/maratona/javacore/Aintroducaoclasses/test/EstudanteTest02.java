package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Kenpachi";
        estudante.sexo = 'M';
        estudante.idade = 40;


        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("--------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
