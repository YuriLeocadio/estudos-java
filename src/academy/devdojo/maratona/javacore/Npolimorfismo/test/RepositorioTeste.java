package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Tanjiro");
        list.add("Inosuke");
        list.add("Zenitsu");
        System.out.println(list);
    }
}
