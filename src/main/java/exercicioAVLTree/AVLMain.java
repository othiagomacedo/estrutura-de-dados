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

        Scanner sc = new Scanner(System.in);

        do{
            String selecao = "";

            //Carregamento de dicionários
            if (Dicionario.getDicionario()==null){
                System.out.println("Carregue um dicionário.\n(1) - Informar um arquivo\n(2) - Carregar Dicionario Portugues já salvo");
                selecao = sc.nextLine();
                //De acordo com o menu, seleciona se vai carregar um arquivo ou vai usar um pré salvo, como o português como padrão
                if (selecao.equalsIgnoreCase("1")) {
                    System.out.println("Informe o caminho do arquivo logo abaixo:");
                    selecao = sc.nextLine();

                    //carrega o vetor de palavras a partir do arquivo
                    Dicionario.setDicionario(Internalizador.leituraArquivo(selecao));
                } else if (selecao.equalsIgnoreCase("2")){

                    //carrega o vetor de palavras a partir do arquivo que está no projeto
                    Dicionario.setDicionario(Internalizador.leituraArquivo("./src/main/java/exercicioAVLTree/dicionario/dic/Portuguese (Brazilian).dic"));
                } else {
                    System.out.println("Opcão inválida");
                }

            }

            int contadorLetras = 0;
            //Inserir o nó na Arvore
            while(true){
                try{
                    char chave = ChaveRandom.aqueleCaractereLa();
                    Node no = arvore.buscarNo(chave);
                    if (no == null){
                        System.out.println("Inserindo "+chave+" na árvore");
                        contadorLetras++;
                        arvore.inserirNo(new Node(chave));
                    } else {
                        break;
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    if (contadorLetras == 26){
                        break;
                    }
                }
            }

            //Imprime a arvore no console
            arvore.printAVLTree();

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
