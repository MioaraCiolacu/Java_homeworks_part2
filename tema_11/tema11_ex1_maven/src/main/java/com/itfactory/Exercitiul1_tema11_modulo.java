package com.itfactory;

public class Exercitiul1_tema11_modulo {

    private int numar1;
    private int numar2;


    public Exercitiul1_tema11_modulo(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    public int moduloNumere(){
        return numar1%numar2;
    }
}
