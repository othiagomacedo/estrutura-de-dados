package exercicioAVLTree.utils;

public class LimpaConsole {

    public static void start() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
