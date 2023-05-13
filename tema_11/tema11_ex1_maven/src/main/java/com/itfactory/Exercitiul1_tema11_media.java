package com.itfactory;

public class Exercitiul1_tema11_media {
    private double numar1;
    private double numar2;
    private double numar3;

    public Exercitiul1_tema11_media(double numar1, double numar2, double numar3) {
        this.numar1 = numar1;
        this.numar2 = numar2;
        this.numar3 = numar3;
    }


    public double medieNumere(){
        return (numar1+numar2+numar3)/3;
    }
}
