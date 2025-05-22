package com.mycompany.residentevil4;

/*
Projeto feito por Sérgio Alexandre Gobbi Rebello
Curso: Ciência da Computação
Turma: CC3MB

Você foi chamado para criar um sistema em Java que simule interações do universo do jogo Resident Evil 4 envolvendo personagens jogáveis, inimigos e chefes utilizando conceitos de Orientação a Objetos.
Requisitos: 

Classes e Herança: Desenvolva a classe abstrata Entidade com os atributos nome e vida, e métodos básicos.

Implemente as classes:

-> Personagens (personagens jogáveis com inventário de itens).
-> Inimigos (inimigos comuns com ações básicas como ataque e detecção.
-> Salazar (chefe do jogo que implementa habilidades especiais definidas pela Interface Bosses.

Inventário e Interações:

Crie a classe Item para representar armas e consumíveis.

Métodos que simulem compra e venda de itens.

Na main: simule interações, incluindo falas, combate, uso de habilidades especiais e exibição do status final das entidades.

Interface Bosses: Crie a Interface Bosses com métodos para habilidades especiais do chefe que você escolher implementar.

*/
// 

import java.util.ArrayList;

public class ResidentEvil4 {

    public static void main(String[] args) {
        // 2 personagens
        Personagens leon = new Personagens("Leon S. Kennedy", 100);
        Personagens ada = new Personagens("Ada Wong", 80);
        
        // Inimigo e boss
        Inimigos ganado = new Inimigos("Ganado", 50);
        Salazar salazar = new Salazar("Salazar", 800);
        
        // Criando itens
        Item ervaVerde = new Item("Erva Verde", 3000);
        Item pistola = new Item("Pistola", 6000);
        Item escopeta = new Item("Escopeta", 12000);
        Item magnum = new Item("Magnum", 25000);

        // Adicionando itens ao inventário
        leon.inventario.add(ervaVerde);
        leon.inventario.add(pistola);
        ada.inventario.add(escopeta);

        // Interações
        System.out.println("\n=== Interações ===");
        leon.falar();
        leon.comprarItem(ervaVerde);
        leon.venderItem(1);

        ada.comprarItem(magnum);

        ganado.detectar();
        leon.atirar();
        ganado.receberDano(50);
        
        salazar.falar();
        salazar.intimidar();
        ada.atirar();
        salazar.receberDano(105);

        salazar.habilidadeEspecial();
        salazar.regenerar();

        // Status final
        System.out.println("\n=== Status Final ===");
        System.out.println(leon.nome + " Vida: " + leon.vida);
        System.out.println(ada.nome + " Vida: " + ada.vida);
        System.out.println(ganado.nome + " Vida: " + ganado.vida);
        System.out.println(salazar.nome + " Vida: " + salazar.vida);
    }
}