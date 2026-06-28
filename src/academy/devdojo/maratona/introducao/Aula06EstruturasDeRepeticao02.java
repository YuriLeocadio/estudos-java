package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int numero = 0;
        while (numero < 1000000) {
            if (numero % 2 == 0) {
                System.out.println(numero);

            }
            numero++;
        }

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
