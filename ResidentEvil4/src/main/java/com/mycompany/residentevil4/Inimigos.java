package com.mycompany.residentevil4;

public class Inimigos extends Entidade {

    public Inimigos(String nome, int vida) {
        super(nome, vida);
    }

    public void detectar() {
        System.out.println(nome + " detectou o jogador!");
    }

    public void atacar() {
        System.out.println(nome + " atacou o jogador!");
    }

    @Override
    public void falar() {
        System.out.println(nome + " rosnou algo incompreensível...");
    }
}
