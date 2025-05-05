package com.mycompany.carromain;

public class Motor {
    private String potencia;
    private String combustivel;

    public Motor(String potencia, String combustivel) {
        this.potencia = potencia;
        this.combustivel = combustivel;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Potência: " + potencia + ", Combustível: " + combustivel;
    }
}
