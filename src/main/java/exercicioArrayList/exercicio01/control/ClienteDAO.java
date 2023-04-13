package exercicioArrayList.exercicio01.control;

import exercicioArrayList.exercicio01.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    static List<Cliente> lista = new ArrayList<Cliente>();
    public static void cadastrar(Cliente cliente){
        lista.add(cliente);
        System.out.println("Cliente "+cliente.getNome()+" cadastrado com sucesso!");
    }

    public static void listar(){
        System.out.println("-------- Lista de clientes --------\n");
        for(Cliente cliente : lista){
            System.out.println(cliente.toString()+"\n - - - - - - - - - \n");
        }
    }
}
