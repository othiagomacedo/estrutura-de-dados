package exercicioAVLTree.arvore;

public class Arvore {

    private Node root;

    public Node buscarNo(int chaveDoNode) {
        Node atual = root;
        while (atual != null) {
            if (atual.chave == chaveDoNode) {
                break;
            }
            atual = atual.chave < chaveDoNode ? atual.direita : atual.esquerda;
        }
        return atual;
    }

    public void inserirNo(char chaveDoNode) {
        root = inserirNo(root, chaveDoNode);
    }

    public void inserirNo(Node node) {
        root = inserirNo(node,node.chave);
    }

    private Node ultimaFolhaEsquerda(Node node) {
        Node noAtual = node;
        while (noAtual.esquerda != null) {
            noAtual = noAtual.esquerda;
        }
        return noAtual;
    }

    private Node inserirNo(Node node, char chaveDoNode) {
        if (node == null) {
            return new Node(chaveDoNode);
        } else if (node.chave > chaveDoNode) {
            node.direita = inserirNo(node.esquerda, chaveDoNode);
        } else if (node.chave < chaveDoNode) {
            node.direita = inserirNo(node.direita, chaveDoNode);
        } else {
            throw new RuntimeException("Essa chave já existe");
        }
        return rebalance(node);
    }

    private Node deletarNo(Node node, int chaveDoNode) {
        if (node == null) {
            return node;
        } else if (node.chave > chaveDoNode) {
            node.esquerda = deletarNo(node.esquerda, chaveDoNode);
        } else if (node.chave < chaveDoNode) {
            node.direita = deletarNo(node.direita, chaveDoNode);
        } else {
            if (node.esquerda == null || node.direita == null) {
                node = (node.esquerda == null) ? node.direita : node.esquerda;
            } else {
                Node mostLeftChild = ultimaFolhaEsquerda(node.direita);
                node.chave = mostLeftChild.chave;
                node.direita = deletarNo(node.direita, node.chave);
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    public void deletarNo(int key) {
        root = deletarNo(root, key);
    }

    private Node rebalance(Node node) {
        updateAltura(node);
        int balance = getBalanceamento(node);
        if (balance > 1) {
            if (altura(node.direita.direita) > altura(node.direita.esquerda)) {
                node = rotacaoEsquerda(node);
            } else {
                node.direita = rotacaoDireita(node.direita);
                node = rotacaoEsquerda(node);
            }
        } else if (balance < -1) {
            if (altura(node.esquerda.esquerda) > altura(node.esquerda.direita)) {
                node = rotacaoDireita(node);
            } else {
                node.esquerda = rotacaoEsquerda(node.esquerda);
                node = rotacaoDireita(node);
            }
        }
        return node;
    }

    private void updateAltura(Node n) {
        n.altura = 1 + Math.max(altura(n.esquerda), altura(n.direita));
    }

    private int altura(Node n) {
        return n == null ? -1 : n.altura;
    }

    public int altura() {
        return root == null ? -1 : root.altura;
    }

    public int getBalanceamento(Node n) {
        return (n == null) ? 0 : altura(n.direita) - altura(n.esquerda);
    }

    public Node getRoot() {
        return root;
    }

        //Rotações
    private Node rotacaoDireita(Node y) {
        Node x = y.esquerda;
        Node z = x.direita;
        x.direita = y;
        y.esquerda = z;
        updateAltura(y);
        updateAltura(x);
        return x;
    }

    private Node rotacaoEsquerda(Node y) {
        Node x = y.direita;
        Node z = x.esquerda;
        x.esquerda = y;
        y.direita = z;
        updateAltura(y);
        updateAltura(x);
        return x;
    }

    //Imprimir Arvore
    public void printAVLTree(Node node, String indent, boolean ultimo) {
        if (node != null) {
            System.out.print(indent);
            if (ultimo) {
                System.out.print("└─");
                indent += "  ";
            } else {
                System.out.print("├─");
                indent += "│ ";
            }
            System.out.println(node.chave);

            printAVLTree(node.esquerda, indent, false);
            printAVLTree(node.direita, indent, true);
        }
    }


    public void printAVLTree() {
        printAVLTree(root, "", true);
    }
}
