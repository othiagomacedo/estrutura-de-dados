package exercicioAVLTree.vetores;

public class NodeVetor {

    char identificador;
    private String preVetor = "";

    private String[] vetorDePalavras;

    NodeVetor(char identificador){
        this.identificador = identificador;
    }

    NodeVetor(char identificador, String[] vetorDePalavras){
        this.identificador = identificador;
        this.vetorDePalavras = vetorDePalavras;
    }

    public String[] getVetorDePalavras() {
        return vetorDePalavras;
    }

    public void setVetorDePalavras(String[] vetorDePalavras) {
        this.vetorDePalavras = vetorDePalavras;
    }

    public void adicionarPalavra(String palavraAdicionada){
        if(preVetor.contains("\n")) {
            preVetor += "\n" + palavraAdicionada;
        } else{
            preVetor = palavraAdicionada;
        }
    }

    public String[] vetorDePalavras() {
        return preVetor.split("\n");
    }

    public void setIdentificador(char identificador) {
        this.identificador = identificador;
    }

    public char getIdentificador() {
        return identificador;
    }

}
