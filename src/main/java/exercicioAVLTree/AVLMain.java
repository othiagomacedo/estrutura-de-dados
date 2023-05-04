package exercicioAVLTree;

import exercicioAVLTree.arvore.Arvore;
import exercicioAVLTree.arvore.Node;
import exercicioAVLTree.dicionario.ChaveRandom;
import exercicioAVLTree.dicionario.Dicionario;
import exercicioAVLTree.dicionario.leitura.Internalizador;
import exercicioAVLTree.utils.LimpaConsole;

import java.util.Scanner;

public class AVLMain {
    static Arvore arvore;
    public static void main(String[] args) throws Exception {
        arvore = new Arvore();
        consoleMenu();
    }

    public static void consoleMenu() throws Exception {
        boolean saida = false;
        boolean carregamentoDicionario = false;

        Scanner sc = new Scanner(System.in);

        do{
            String selecao = "";

            //Carregamento de dicionários
            if (!carregamentoDicionario){
                System.out.println("Carregue um dicionário.\n(1) - Informar um arquivo\n(2) - Carregar Dicionario Portugues já salvo");
                selecao = sc.nextLine();
                //De acordo com o menu, seleciona se vai carregar um arquivo ou vai usar um pré salvo, como o português como padrão
                if (selecao.equalsIgnoreCase("1")) {
                    System.out.println("Informe o caminho do arquivo logo abaixo:");
                    selecao = sc.nextLine();

                    //carrega o vetor de palavras a partir do arquivo
                    Dicionario.setDicionario(Internalizador.leituraArquivo(selecao));
                    carregamentoDicionario = true;
                } else if (selecao.equalsIgnoreCase("2")){

                    //carrega o vetor de palavras a partir do arquivo que está no projeto
                    Dicionario.setDicionario(Internalizador.leituraArquivo("./dicionario/dic/Portuguese (Brazilian).dic"));
                    carregamentoDicionario = true;
                } else {
                    System.out.println("Opcão inválida");
                }

            }

            //TODO Inserir o nó na Arvore
            while(true){
                char chave = ChaveRandom.aqueleCaractereLa();
                Node no = arvore.buscarNo(chave);
                if (no.equals(null)){
                    arvore.inserirNo(new Node(chave));
                }
                break;
            }

            LimpaConsole.start();
            //Verifica se continua o programa
            System.out.println("Continuar?\n(1) - SIM | (2) - NÃO");
            selecao = sc.nextLine();
            selecao = selecao.equalsIgnoreCase("1") ? "nao sair" : "sair";
            if(selecao.equalsIgnoreCase("sair")){
                LimpaConsole.start();
                break;
            } else {
                LimpaConsole.start();
            }
        } while (!saida);
        sc.close();
    }
}
