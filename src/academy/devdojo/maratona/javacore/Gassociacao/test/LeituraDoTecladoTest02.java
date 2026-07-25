package academy.devdojo.maratona.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de numero primo");
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O numero " + numero + " é primo.");
        } else {
            System.out.println("O numero " + numero + " não é primo.");
        }
    }
}
