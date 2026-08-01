package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public interface DataLoader {
    //    todos os atributos dentro de interface são por padrão constantes
    public static final int MAX_DATA_SIZE = 10;

    //    todos métodos dentro de interface são por padrão público e abstrato
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Verificando permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
