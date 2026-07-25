package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogares;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogares) {
        this.nome = nome;
        this.jogares = jogares;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(jogares == null){
            return;
        }
        for(Jogador jogador : jogares){
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogares;
    }

    public void setJogadores(Jogador[] jogares) {
        this.jogares = jogares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
