package com.mycompany.aulaconta;

public class AulaConta {

    public static void main(String[] args) {
        System.out.println("BANCO");
        Conta c1 = new Conta();
        c1.numero = 10;
        c1.nome = "Sérgio";
        c1.limite = 1000;
        c1.saldo = 2000;
        
        c1.Depositar(100);
        boolean resultado;
        resultado = c1.Sacar(300);
        System.out.println(resultado);
    }
}
