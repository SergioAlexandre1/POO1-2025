package com.mycompany.carromain;

public class CarroMain {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Carlos", "123456");
        Motorista motorista2 = new Motorista("Ana", "654321");

        Motor motor1 = new Motor("1.6", "Gasolina");
        Motor motor2 = new Motor("2.0", "Diesel");

        Carro carro1 = new Carro("Civic", motorista1, motor1);
        Carro carro2 = new Carro("Hilux", motorista2, motor2);

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.setMotorista(motorista2);
        System.out.println("\nApós troca de motorista para o carro1:");
        System.out.println(carro1);

        System.out.println("\nContador de motoristas no sistema: " + Motorista.getContadorMotoristas());
    }
}
