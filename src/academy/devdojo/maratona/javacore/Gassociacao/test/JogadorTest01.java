package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Lamine Yamal");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }

}
