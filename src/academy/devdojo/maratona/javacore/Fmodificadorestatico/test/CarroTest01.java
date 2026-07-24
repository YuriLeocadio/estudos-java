package academy.devdojo.maratona.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratona.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mitsubishi", 275);
        Carro c3 = new Carro("Nissan", 290);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
