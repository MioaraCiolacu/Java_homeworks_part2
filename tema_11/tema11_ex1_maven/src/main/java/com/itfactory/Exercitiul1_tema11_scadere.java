package com.itfactory;

public class Exercitiul1_tema11_scadere {

    private int numar1;
    private int numar2;
    private int numar3;

    public Exercitiul1_tema11_scadere(int numar1, int numar2, int numar3) {
        this.numar1 = numar1;
        this.numar2 = numar2;
        this.numar3 = numar3;
    }

    public int scadeNumere(){
        return numar1-numar2-numar3;
    }
}
