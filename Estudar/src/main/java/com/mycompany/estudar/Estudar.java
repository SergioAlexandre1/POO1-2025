package com.mycompany.estudar;

public class Estudar {
    public static void main(String[] args) {
        // Criando Editora
        Editora editora = new Editora("Editora Exemplar", "contato@exemplar.com");

        // Criando Autores
        Autor autor1 = new Autor("João Silva", "JS", "Telefone", "98765-4321");
        Autor autor2 = new Autor("Maria Oliveira", "MO", "Telefone", "1234-5678");

        // Criando Livro
        Livro livro = new Livro("Java para Iniciantes", 2025, editora);
        livro.adicionarAutor(autor1);
        livro.adicionarAutor(autor2);

        // Exibindo informações
        System.out.println("Informações do Livro:\n");
        System.out.println(livro);

        System.out.println("\nInformações dos Autores:\n");
        for (Autor autor : livro.getAutores()) {
            System.out.println(autor);
        }

        System.out.println("\nInformações da Editora:\n");
        System.out.println(editora);
    }
}
