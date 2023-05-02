package exercicioAVLTree.dicionario.leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Internalizador {

    public static String[] leituraArquivo(String caminhoArquivo) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha = "";
            String arquivoLido = "";
            while ((linha = br.readLine())!=null){
                String[] auxLinha = linha.split("/");
                arquivoLido += auxLinha[0] + "\n";
            }
            return arquivoLido.split("\n");
        }catch (IOException e){
            throw new IOException("Houve um erro ao ler o arquivo "+caminhoArquivo+ " : "+e);
        }
    }
}


