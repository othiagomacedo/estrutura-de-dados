package exercicioAVLTree;

import exercicioAVLTree.arvore.Arvore;
import exercicioAVLTree.arvore.Node;
import exercicioAVLTree.dicionario.leitura.Internalizador;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AVLMain {
    static Arvore arvore;
    public static void main(String[] args) {
        arvore = new Arvore();
    }

    public void consoleMenu() throws IOException {
        boolean saida = false;
        boolean carregamentoDicionario = false;

        Scanner sc = new Scanner(System.in);
        do{
            String selecao = "";

            //Carregamento de dicionários
            if (!carregamentoDicionario){
                System.out.println("Carregue um dicionário.\n(1) - Informar um arquivo\n(2) - Carregar um salvo");
                selecao = sc.nextLine();
                //De acordo com o menu, seleciona se vai carregar um arquivo ou vai usar um pré salvo, como o português como padrão
                if (selecao.equalsIgnoreCase("1")) {
                    System.out.println("Informe o caminho do arquivo logo abaixo:");
                    selecao = sc.nextLine();

                    //carrega o vetor de palavras a partir do arquivo
                    String[] vetorDePalavrasLido = Internalizador.leituraArquivo(selecao);
                }
            }

            //Verifica se continua o programa
            System.out.println("Continuar?\n(1) - SIM | (2) - NÃO");
            selecao = sc.nextLine();
            selecao = selecao.equalsIgnoreCase("1") ? "sair" : "não sair";
            if(selecao.equalsIgnoreCase("sair")){
                break;
            }
        } while (!saida);
        sc.close();
    }
}
