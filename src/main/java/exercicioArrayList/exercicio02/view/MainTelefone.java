package exercicioArrayList.exercicio02.view;

import exercicioArrayList.exercicio02.control.TelefoneDAO;

import java.util.Scanner;

public class MainTelefone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sel;
        String telefone;
        while(true) {
            System.out.println("--- Menu Telefone ---------");
            System.out.println("(a) - Adicionar\n(r) - Remover\n(l) - Listar\n(s) - Sair");
            sel = sc.nextLine();
            if(!sel.equalsIgnoreCase("s")){
                switch (sel){
                    case "a":{
                        System.out.println("\nAdicione o telefone na lista:");
                        telefone = sc.nextLine();
                        TelefoneDAO.adicionar(telefone);
                    }break;
                    case "r":{
                        System.out.println("\nRemover telefone. Informe a posição: ");
                        int pos = Integer.parseInt(sc.nextLine());
                        TelefoneDAO.remover(pos);
                    }break;
                    case "l":{
                        TelefoneDAO.listar();
                    }break;
                }
            } else {
                System.out.println("Saindo aqui... ");
                break;
            }
        }
    }
}
