package com.mycompany.residentevil4;

import java.util.List;
import java.util.ArrayList;

public class Personagens extends Entidade {
    List<Item> inventario = new ArrayList<>();

    public Personagens(String nome, int vida) {
        super(nome, vida);
    }

    public void equiparArma() {
        System.out.println(nome + " selecionou uma arma.");
    }

    public void atirar() {
        System.out.println(nome + " disparou: BANG!");
    }

    public void comprarItem(Item item) {
        inventario.add(item);
        System.out.println(nome + " comprou " + item.nome + ". Obrigado!");
    }

    public void venderItem(int i) {
        if (i < inventario.size()) {
            Item item = inventario.get(i);
            if (item.preco <= 10000) {
                System.out.println("Eu compro o que você quiser, estranho.");
            } else {
                System.out.println("Estranho, ESTRANHO... Comprarei isto por um alto preço!");
            }
            inventario.remove(i);
        } else {
            System.out.println("Item não encontrado no inventário.");
        }
    }

    @Override
    public void falar() {
        System.out.println("Use facas da próxima vez. São mais rápidas. ");
    }
}
