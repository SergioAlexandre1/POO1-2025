package com.mycompany.estudar;

public class Contato {
    private String tipo;
    private String c;
    
    public Contato(String tipo, String c){
        this.tipo = tipo;
        this.c = c;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContato() {
        return c;
    }

    public void setContato(String c) {
        this.c = c;
    }
}
