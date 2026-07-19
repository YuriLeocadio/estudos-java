package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros(26, 30.6);
        calculadora.subtrairDoisNumeros(26.2, 30.6);
        calculadora.multiplicarDoisNumeros(26.2, 30.6);
        double resultado = calculadora.dividirDoisNumeros(26.2, 30.6);

        System.out.println("Divisão: " + resultado);
        System.out.println("Finalizando Calculadora.");
        System.out.println("--------------------");
        calculadora.imprimeDivisaoDeDoisNumeros02(26.2, 0);
    }
}
