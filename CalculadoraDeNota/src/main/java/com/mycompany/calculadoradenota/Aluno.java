package com.mycompany.calculadoradenota;
import java.time.Year;
import java.util.Random;

public class Aluno {
    private static int qtd_alunos = 0;
    private String Matricula;
    private String Nome;
    private String Curso;
    private String Turma;
    private int Periodo;
    private double N1B;
    private double N2B;
    private double NF;
    
    public Aluno(){
        this.Matricula = gerarMatricula();
        this.Nome = Nome;
        this.Curso = Curso;
        this.Turma = Turma;
        this.Periodo = Periodo;
        this.N1B = N1B;
        this.N2B = N2B;
        qtd_alunos++;
    }
    
    private String gerarMatricula(){
        int ano =  Year.now().getValue();
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10000);
        return ano+String.format("%04d", numeroAleatorio);
    }
    
    public boolean passar(String novaTurma, int novoPeriodo){
        if(this.NF>=7){
                    this.Turma = novaTurma;
                    this.Periodo = novoPeriodo;
                    return true;
        }else{
            System.out.println("Aluno Reprovado. ");
            return false;
        }
    }
    
    public void imprimir(){
    System.out.println("Matricula: "+this.Matricula);
    System.out.println("Nome");
    }
    
    public String getMatricula() {
        return Matricula;
    }

    public String getNome() {
        return Nome;
    }

    public String getCurso() {
        return Curso;
    }

    public String getTurma() {
        return Turma;
    }

    public int getPeriodo() {
        return Periodo;
    }

    public double getN1B() {
        return N1B;
    }

    public double getN2B() {
        return N2B;
    }

    public double getNF() {
        return NF;
    }

    public static int getQtd_alunos() {
        return qtd_alunos;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public void setPeriodo(int Periodo) {
        this.Periodo = Periodo;
    }

    public void setN1B(double N1B) {
        this.N1B = N1B;
    }

    public void setN2B(double N2B) {
        this.N2B = N2B;
        calcularNotaFinal();
    }
    
    public void calcularNotaFinal(){
        this.NF = (this.N1B+this.N2B)/2;
    }
}
