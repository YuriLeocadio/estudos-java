package academy.devdojo.maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        // Operador ternário: (condição) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro Yuri." : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);

    }
}
