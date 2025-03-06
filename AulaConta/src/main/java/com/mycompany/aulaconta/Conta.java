package com.mycompany.aulaconta;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;
    
    boolean Sacar(double valor){
        if(valor > saldo){
            System.out.println("Saque não permitido. ");
            return false;
        }
        else{
            saldo -= valor;
            System.out.println("Saque liberado. ");
            return true;
        }
        //saldo = saldo - valor;
    }
    void Depositar(double valor){
        saldo += valor;
        //saldo = saldo + valor
    }
}
