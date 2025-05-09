package com.mycompany.estudar;
import java.util.List;
import java.util.ArrayList;

public class Autor {
    private String nome;
    private String abv;
    private List<Contato> contatos;

    public Autor(String nome, String abv, String tipo, String c) {
        this.nome = nome;
        this.abv = abv;
        this.contatos = new ArrayList<>();
        Contato cont = new Contato(tipo, c);
        contatos.add(cont); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    @Override
    public String toString() {
        StringBuilder contatosInfo = new StringBuilder(); // Para construir os detalhes de contatos
        for (Contato contato : contatos) {
            contatosInfo.append(contato.getTipo())
                        .append(": ")
                        .append(contato.getContato())
                        .append("\n"); // Adicionar quebra de linha após cada contato
        }
        return "Autor: " + nome + " (" + abv + ")\n" +
               "Contatos:\n" + contatosInfo;
    }
}
