package com.mycompany.residentevil4;

public abstract class Entidade {
    public String nome;
    public int vida;

    public Entidade(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void falar();

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }
}

