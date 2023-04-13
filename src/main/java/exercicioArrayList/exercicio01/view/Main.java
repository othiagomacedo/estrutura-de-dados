package exercicioArrayList.exercicio01.view;

import exercicioArrayList.exercicio01.control.ClienteDAO;
import exercicioArrayList.exercicio01.model.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long id = 1;
        String nome;
        int idade;
        String telefone;
        while(true){
            System.out.println("Inserir Cliente\nID: ");
            id = Long.parseLong(sc.nextLine());
            if (id > 0){
                System.out.println("\nNome completo: ");
                nome = sc.nextLine();

                System.out.println("\nIdade:");
                idade = Integer.parseInt(sc.nextLine());

                System.out.println("\nTelefone:");
                telefone = sc.nextLine();

                Cliente cliente = new Cliente(id,nome,idade,telefone);

                ClienteDAO.cadastrar(cliente);
            } else {
                ClienteDAO.listar();
                break;
            }
        }
    }
}
