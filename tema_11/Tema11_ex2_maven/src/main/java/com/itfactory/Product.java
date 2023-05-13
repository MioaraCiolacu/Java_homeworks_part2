package com.itfactory;

import java.util.Objects;

public class Product {
    private String nume;
    private double pret;
    private int cantitate;
    private TYPE type;

    public Product(String nume, double pret, int cantitate, TYPE type) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
        this.type = type;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPret(), getPret()) == 0 && getCantitate() == product.getCantitate() && Objects.equals(getNume(), product.getNume()) && getType() == product.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNume(), getPret(), getCantitate(), getType());
    }
}
