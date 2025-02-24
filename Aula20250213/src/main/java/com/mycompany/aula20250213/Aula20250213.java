package com.mycompany.aula20250213;
import java.util.Scanner;

public class Aula20250213 {

    static float n1, n2, result;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        do {
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
                    Valores(scan);
                    result = soma();
                    System.out.printf("A soma dos valores é: %.2f\n", result);
                    break;
                case 2:
                    Valores(scan);
                    result = subtracao();
                    System.out.printf("A diferença dos valores é: %.2f\n", result);
                    break;
                case 3:
                    Valores(scan);
                    result = multiplicacao();
                    System.out.printf("O produto dos valores é: %.2f\n", result);
                    break;
                case 4:
                    Valores(scan);
                    if (n2 != 0) {
                        result = divisao();
                        System.out.printf("A divisão dos valores é: %.2f\n", result);
                    } else {
                        System.out.println("Erro! Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Digite um valor entre 0 e 4.");
                    break;
            }
        } while (opcao != 0);
        
        scan.close();
    }

    public static void Valores(Scanner scan) {
        System.out.println("\n\tDigite o primeiro valor: ");
        n1 = scan.nextFloat();
        System.out.println("\n\tDigite o segundo valor: ");
        n2 = scan.nextFloat();
    }

    public static float soma() {
        return n1 + n2;
    }

    public static float subtracao() {
        return n1 - n2;
    }

    public static float multiplicacao() {
        return n1 * n2;
    }

    public static float divisao() {
        return n1 / n2;
    }
}