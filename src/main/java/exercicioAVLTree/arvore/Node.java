package exercicioAVLTree.arvore;

import exercicioAVLTree.vetores.NodeVetor;

public class Node {

    char chave;
    int altura;
    Node esquerda;
    Node direita;

    NodeVetor vetorDoNode;

    Node(char chave) {
        this.chave = chave;
        vetorDoNode.setIdentificador(chave);
    }

}
