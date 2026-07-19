package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros(double num1, double num2){
        System.out.println("Soma: " + (num1 + num2));
    }

    public void subtrairDoisNumeros(double num1, double num2){
        System.out.println("Subtração: " + (num1 - num2));
    }

    public void multiplicarDoisNumeros(double num1, double num2){
        System.out.println("Multiplicação: " + (num1 * num2));
    }

    public double dividirDoisNumeros(double num1, double num2){
        if (num2 == 0 ) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
        return num1 / num2;
    }
    public void imprimeDivisaoDeDoisNumeros02(double num1, double num2){
        if (num2 == 0 ) {
            System.out.println("Não é possível dividir por zero.");
            return;
        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 10;
        numero2 = 20;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + numero1);
        System.out.println("num2: " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num:numeros){
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println("Soma: " + soma);
    }
}
