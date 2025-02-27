package com.mycompany.teste1;

public class Teste1 {

    public static void main(String[] args) {
        System.out.println("EXEMPLOS");
        
        SoDados sd;
        sd = new SoDados();
        
        sd.i = 10;
        sd.f = 100;
        sd.b = true;
        
        SoDados x;
        x = new SoDados();
        
        x.i = 20;
        x.f = 200;
        x.b = false;
        
        sd.Imprimir();
    }
}
