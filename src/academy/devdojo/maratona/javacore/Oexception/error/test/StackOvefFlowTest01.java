package academy.devdojo.maratona.javacore.Oexception.error.test;

public class StackOvefFlowTest01 {
    public static void main(String[] args) {
        recursao();
    }

    public static void recursao() {
        recursao();
    }
}
