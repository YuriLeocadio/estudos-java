package academy.devdojo.maratona.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static{
        System.out.println("Dentro do bloco estático de inicialização de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprimi() {
        super.imprimi();
        System.out.println(this.salario);
    }

    public void relatorioPagamaento() {
        System.out.println("Eu " + this.nome + " Recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
