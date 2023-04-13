package exercicioArrayList.exercicio03.model;

public class Aluno {

    long numMatricula;
    String nome;
    float notaBim1;
    float notaBim2;

    String situacao;

    public Aluno(long numMatricula, String nome, float notaBim1, float notaBim2, String situacao) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.notaBim1 = notaBim1;
        this.notaBim2 = notaBim2;
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public long getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(long numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaBim1() {
        return notaBim1;
    }

    public void setNotaBim1(float notaBim1) {
        this.notaBim1 = notaBim1;
    }

    public float getNotaBim2() {
        return notaBim2;
    }

    public void setNotaBim2(float notaBim2) {
        this.notaBim2 = notaBim2;
    }
}
