package exercicioAVLTree.dicionario.leitura;

import exercicioAVLTree.utils.LimpaConsole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Internalizador {

    public static String[] leituraArquivo(String caminhoArquivo) throws Exception {
        LimpaConsole.start();
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            System.out.println("Arquivo identificado para ser lido: "+caminhoArquivo);
            String linha = "";
            String arquivoLido = "";
            int contador = 0;
            System.out.println("Inicio da Contagem ............... ");
            while ((linha = br.readLine())!=null){
                String[] auxLinha = linha.split("/");
                arquivoLido += auxLinha[0] + "\n";
                if ((contador++ % 20000) == 0){
                    System.out.println("Contagem de linhas:"+contador);
                }
            }
            System.out.println("total de linhas contadas: "+contador);
            return arquivoLido.split("\n");
        }catch (IOException e){
            throw new IOException("Houve um erro ao ler o arquivo "+caminhoArquivo+ " : "+e);
        }
    }
}


