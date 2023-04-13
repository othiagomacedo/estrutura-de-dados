package exercicioArrayList.exercicio03.view;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainAluno {

    public static void main(String[] args) {
        String nome;
        long matricula;
        float n1;
        float n2;
        String seletor = "S";

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Registrar um aluno? \n(s) - SIM\n(n) - NÃO");
            seletor = sc.nextLine();
            if(seletor.equalsIgnoreCase("s")){
                System.out.println("\nMatricula: ");
                matricula = Long.parseLong(sc.nextLine());

                System.out.println("\nNome Completo:");
                nome = sc.nextLine();

                System.out.println("\nPrimeira Nota: ");
                n1 = Float.parseFloat(sc.nextLine());

                System.out.println("\nSegunda Nota: ");
                n2 = Float.parseFloat(sc.nextLine());
            } else{
                System.out.println("Saindo aqui..");
                break;
            }
        }
    }

}
