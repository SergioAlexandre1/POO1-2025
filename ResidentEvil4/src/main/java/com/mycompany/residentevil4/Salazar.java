package com.mycompany.residentevil4;

public class Salazar extends Inimigos implements Bosses {

    public Salazar(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " cospe um líquido preto extremamente corrosivo. ");
    }

    @Override
    public void intimidar() {
        System.out.println(nome + " diz: 'Você não tem chance contra mim, inseto!'");
    }

    public void regenerar() {
        System.out.println(nome + " usa sua habilidade de regeneração e recupera vida!");
        this.vida += 50; // Regenera 50 de vida
    }

    @Override
    public void falar() {
        System.out.println(nome + " proclama: 'Bem-vindo ao meu castelo! Você não sairá vivo.'");
    }
}
