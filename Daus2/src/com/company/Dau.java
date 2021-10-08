package com.company;

public class Dau {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void tirar() {
        setValor((int) (Math.random() * 6 + 1));
    }

    @Override
    public String toString() {
        return "Dado" + "=" + valor + " ";

    }
}