package exercicioAVLTree.arvore;

import exercicioAVLTree.vetores.NodeVetor;

public class Node {

    char chave;
    int altura;
    Node esquerda;
    Node direita;

    NodeVetor vetorDoNode;

    public Node(char chave) {
        vetorDoNode = new NodeVetor(chave);
        this.chave = chave;
    }

    public char getChave() {
        return chave;
    }

    public void setChave(char chave) {
        vetorDoNode.setIdentificador(chave);
        this.chave = chave;
    }

    public void setVetorPrincipal(String[] vetor){
        vetorDoNode.setVetorDePalavras(vetor);
    }

    public String[] getVetorPrincipal(){
        return vetorDoNode.getVetorDePalavras();
    }

}
