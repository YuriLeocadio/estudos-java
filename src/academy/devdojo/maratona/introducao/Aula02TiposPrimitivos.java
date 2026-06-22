package academy.devdojo.maratona.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 18;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        char caractereASCII = 89;
        char caractereUnicode = '\u0041';
        String nome = "Yuri Moreira Leocadio";

        System.out.println("A idade é: " + idade + "  anos");
        System.out.println(verdadeiro);
        System.out.println("char: " + caractere);
        System.out.println("char ASCII: " + caractereASCII);
        System.out.println("char Unicode: " + caractereUnicode);
        System.out.println("Oi meu nome é " + nome);
    }
}
