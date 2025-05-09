package com.mycompany.estudar;
import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private List<Autor> autores;
    private Editora editora;
    
    public Livro(String titulo, int anoPublicacao, Editora editora){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.autores = new ArrayList<>();
    }
    public void adicionarAutor(Autor autor){
        autores.add(autor);
    }
    public List<Autor> getAutores(){
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String toString() {
        return "Livro: \n" +
                "Titulo: " + titulo + "\n" +
                "Ano de Publicacao: " + anoPublicacao + "\n" +
                "Autores: " + (autores.isEmpty() ? "Nenhum autor registrado" : autores) + "\n" +
                "Editora: " + (editora != null 
                    ? "Nome: " + editora.getNome() 
                    : "Sem editora registrada");
    }
}
