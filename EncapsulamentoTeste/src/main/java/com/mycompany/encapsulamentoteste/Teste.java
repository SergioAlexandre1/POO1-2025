package com.mycompany.encapsulamentoteste;

public class Teste {
    public int a = 10;
    public int b = 10;
    private int c = 10;
    
    public Teste(){
        this.a = 10;
        this.b = 10;
        this.c = 10;
    }
    public Teste(int a, int b, int c){
        this.a = 10;
        this.b = 10;
        this.c = 10;
    }
    public int getC(){
        return this.c;
    }
    
    public void setC(int c){
        this.c = c;
    }
    
    public void ImprimeA(){
        System.out.println("Valor de A: "+a);
    }
    
    public void ImprimeB(){
        System.out.println("Valor de B: "+b);
    }
    
    public void ImprimeC(){
        System.out.println("Valor de C: "+c);
    }
}
