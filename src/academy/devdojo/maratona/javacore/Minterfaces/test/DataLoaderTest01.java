package academy.devdojo.maratona.javacore.Minterfaces.test;

import academy.devdojo.maratona.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
