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
        opcao = scan.nextInt();
        switch (opcao) {
            case 0:
                System.out.println("Saindo da calculadora... ");
                break;
            case 1:
                int n1, n2, sum;
                System.out.println("\n\tDigite o primeiro valor: ");
                n1 = scan.nextInt();
                System.out.println("\n\tDigite o segundo valor: ");
                n2 = scan.nextInt();
                sum = n1 + n2;
                System.out.printf("A soma dos valores é: %d", sum);
                break;
            case 2:
                int n1, n2, sub;
                System.out.println("\n\tDigite o primeiro valor: ");
                n1 = scan.nextInt();
                System.out.println("\n\tDigite o segundo valor: ");
                n2 = scan.nextInt();
                sub = n1 - n2;
                System.out.printf("A diferença dos valores é: %d", sub);
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("Opção inválida! Digite um valor entre 0 e 4. ");
                break;
        }
        scan.close();
    }
}
