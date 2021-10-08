package com.company;

public class Juegodados {

    Dau dau1, dau2, dau3;

    public Juegodados() {
        dau1 = new Dau();
        dau2 = new Dau();
        dau3 = new Dau();
    }

    public void jugar() {
        dau1.tirar();
        dau2.tirar();
        dau3.tirar();
        System.out.println(dau1.toString() + dau2.toString() + dau3.toString());
    }

    public boolean gana() {
        return dau1.getValor() == dau2.getValor() && dau1.getValor() == dau3.getValor();
    }

    @Override
    public String toString() {
        return "HAS GANADO EL JUEGO!" +
                "  dau1=" + dau1 +
                "  dau2=" + dau2 +
                "  dau3=" + dau3;
    }
}

