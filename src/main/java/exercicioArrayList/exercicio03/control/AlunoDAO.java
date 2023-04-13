package exercicioArrayList.exercicio03.control;

import exercicioArrayList.exercicio03.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private static List<Aluno> lista = new ArrayList<>();
    private static int qdteRep = 0;
    private static int qdteExame = 0;
    private static int qdteApv = 0;

    private static float notaTotalClasse = 0F;

    public static void adicionar(Aluno aluno){
        lista.add(aluno);
        System.out.println("Aluno "+aluno.getNome()+" adicionado a lista!\n");
    }

    public String situacaoAluno(float n1, float n2){
        float res = (n1+n2)/2;
        notaTotalClasse += res;
        String sit = "";

        if(res > 4F){
            if(res > 6F){
                qdteApv++;
                sit = "APROVADO";
            } else{
                qdteExame++;
                sit = "EXAME";
            }
        } else {
            qdteRep++;
            sit = "REPROVADO";
        }
        return sit;
    }

    public static int getQdteRep() {
        return qdteRep;
    }

    public static int getQdteExame() {
        return qdteExame;
    }

    public static int getQdteApv() {
        return qdteApv;
    }

    public static float mediaClasse(){
        return notaTotalClasse/(qdteRep+qdteExame+qdteApv);
    }

    public static void resultados(){
        System.out.println(" -------- Resultados até agora ---------- ");
        System.out.println("Quantidade de alunos registrados: "+lista.size());
        System.out.println("Aprovados: "+qdteApv);
        System.out.println("Em exame: "+qdteExame);
        System.err.println("Reprovados: "+qdteRep);
        System.out.println("Média da Turma: "+mediaClasse());
    }
}
