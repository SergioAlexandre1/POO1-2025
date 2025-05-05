package com.mycompany.carromain;

public class Motorista {
    private String nome;
    private String CNH;
    private static int contadorMotoristas = 0;

    public Motorista(String nome, String CNH) {
        this.nome = nome;
        this.CNH = CNH;
        contadorMotoristas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public static int getContadorMotoristas() {
        return contadorMotoristas;
    }

    @Override
    public String toString() {
        return "Motorista: " + nome + " (CNH: " + CNH + ")";
    }
}
