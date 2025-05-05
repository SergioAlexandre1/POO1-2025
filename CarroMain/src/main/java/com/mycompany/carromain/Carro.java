package com.mycompany.carromain;

public class Carro {
    private String modelo;
    private Motorista motorista;
    private Motor motor;
    private int vezesQueFoiDirigido;

    public Carro(String modelo, Motorista motorista, Motor motor) {
        this.modelo = modelo;
        this.motorista = motorista;
        this.motor = motor;
        this.vezesQueFoiDirigido = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
        vezesQueFoiDirigido++;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getVezesQueFoiDirigido() {
        return vezesQueFoiDirigido;
    }

    @Override
    public String toString() {
        return "Carro: " + modelo + "\n" +
               "Motorista: " + (motorista != null ? motorista.getNome() : "Nenhum motorista") + "\n" +
               "Motor: " + motor.toString() + "\n" +
               "Vezes que foi dirigido: " + vezesQueFoiDirigido;
    }
}
