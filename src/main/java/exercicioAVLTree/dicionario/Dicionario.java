package exercicioAVLTree.dicionario;

public class Dicionario {

    private static String[] dicionarioRaiz;

    public Dicionario() {}

    public static String[] getDicionario() {
        return dicionarioRaiz;
    }

    public static void setDicionario(String[] dicionario) {
        dicionarioRaiz = dicionario;
    }
}
