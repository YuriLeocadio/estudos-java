package academy.devdojo.maratona.javacore.Dconstrutores.test;

import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "Shounen", 24, "Aventura", "Studio Pierrot");
        anime.imprime();
    }
}
