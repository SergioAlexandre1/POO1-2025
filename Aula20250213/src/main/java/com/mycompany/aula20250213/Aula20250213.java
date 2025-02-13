package com.mycompany.aula20250213;
import java.util.Scanner;

public class Aula20250213 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int opcao;
        
        System.out.println("=======================");
        System.out.println("\tMENU");
        System.out.println("=======================");
        System.out.println("[1] - Adição (+)");
        System.out.println("[2] - Subtração (-)");
        System.out.println("[3] - Multiplicação (*)");
        System.out.println("[4] - Divisão (/)");
        System.out.println("[0] - Sair");
        System.out.println("=======================");
        System.out.println("\n\tDigite a opção desejada: ");
        int opcao = scan.nextInt();
    }
}
