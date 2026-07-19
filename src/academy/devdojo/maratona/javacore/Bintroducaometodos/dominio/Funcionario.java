package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null || salarios.length == 0){
            System.out.println("Salarios não registrados.");
            return;
        }
        for (double salario : salarios){
            System.out.print(salario + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial(){
        if (salarios == null || salarios.length == 0){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial: " + media);
    }
}
