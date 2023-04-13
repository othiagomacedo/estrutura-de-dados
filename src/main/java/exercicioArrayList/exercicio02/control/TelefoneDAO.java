package exercicioArrayList.exercicio02.control;

import java.util.ArrayList;
import java.util.List;

public class TelefoneDAO {

    private static List<String> lista = new ArrayList<>();

    public static void adicionar(String telefone){
        lista.add(telefone);
        System.out.println("Telefone "+telefone+" adicionado com sucesso!");
    }

    public static void remover(int posicao){
        try{
            lista.remove(posicao);
            System.out.println("Telefone removido com sucesso");
        }catch (Exception e){
            System.out.println("Erro em remover da posicao "+posicao+ " : "+e.getMessage());
        }
    }

    public static void listar(){
        System.out.println("------ Lista de telefones cadastrados até agora ------");
        for(String tel : lista){
            System.out.println("Pos: "+ lista.indexOf(tel)+" Telefone: "+tel);
        }
        System.out.println("\n");
    }
}
