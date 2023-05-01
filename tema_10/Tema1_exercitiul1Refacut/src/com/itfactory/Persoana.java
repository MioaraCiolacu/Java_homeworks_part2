package com.itfactory;

import java.util.Objects;

public class Persoana {

    private String nume;
    private Calitate functie;



    public Persoana(Calitate functie, String nume) {
        this.functie = functie;
        this.nume = nume;
    }

    public Calitate getFunctie() {
        return functie;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return functie == persoana.functie && Objects.equals(nume, persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functie, nume);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "functie=" + functie +
                ", nume='" + nume + '\'' +
                '}';
    }
}
