package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Mitsubishi";
        carro.modelo = "Lancer";
        carro.ano = 2020;

        carro2.nome = "Nissan";
        carro2.modelo = "Skyline R34";
        carro2.ano = 2001;

        System.out.println("Carro 1: " + carro.nome +
                " " + carro.modelo +
                " " + carro.ano);

        System.out.println("Carro 2: " + carro2.nome +
                " " + carro2.modelo +
                " " + carro2.ano);
    }
}
