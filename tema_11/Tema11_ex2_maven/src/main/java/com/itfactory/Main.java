package com.itfactory;


import java.util.ArrayList;
import java.util.List;

public class Main {
    //Problema 2.
    //
    //Cos de cumparaturi.
    //Creati un proiect maven prin care se vor implementa urmatoarele cerinte:
    //1. Se va crea un enum "com.itfactory.TYPE" simplu ce va defini un tip de produs. (CARNE, LACTATE, VEGAN)
    //2. Se va crea o clasa "Product" in care se vor defini un nume (String), pret (double), cantitate (int), tip (com.itfactory.TYPE)
    //3. Se va crea o clasa "Basket" ce va reprezenta cosul de cumparaturi. Vom avea o lista de produse in aceasta clasa.
    //
    //
    //Vom defini urmatoarele functionalitati.
    //a. Adaugam un produs in care se va specifica tipul. O metoda ce primeste ca parametru un "product" si introduce in lista.
    //b. Selectie a produselor pe baza unui tip.
    //c. Calcul cost total pentru cos de cumparaturi (Atentie la cantitatea fiecarui produs)
    //d. Calcul cost pentru un tip de produse (Atentie la cantitate)
    //
    //
    //Sa se scrie teste unitare pentru clasa Cosul de cumparaturi.
    //a. Un test ce verifica daca adauga corect un produs. (Dupa ce adaugam dimensiunea listei trebuie sa creasca)
    //b. Un test ce verifica produsele selectate pe baza unui tip. (comparam doua liste. atentie la metodele equals/hashcode)
    //c. Un test ce verifica calculul total.
    //d. un test ce verifica cosutl pentru un tip de produse.

    public static void main(String[] args) {
        Basket cosCumparaturi = new Basket();
        cosCumparaturi.addProduct(new Product("carna vita", 52.50, 2, TYPE.CARNE));
        cosCumparaturi.addProduct(new Product("carna porc", 22.50, 3, TYPE.CARNE));
        cosCumparaturi.addProduct(new Product("lapte", 12.0, 2, TYPE.LACTATE));
        cosCumparaturi.addProduct(new Product("iaurt", 3.20, 5, TYPE.LACTATE));
        cosCumparaturi.addProduct(new Product("branza", 22.00, 1, TYPE.LACTATE));
        cosCumparaturi.addProduct(new Product("seminte", 13.60, 1, TYPE.VEGAN));
        cosCumparaturi.addProduct(new Product("ciocolata", 52.50, 2, TYPE.VEGAN));

        System.out.println(cosCumparaturi.getTotal());  //52.5*2+22.50*3+12*2+3.2*5+22+13.6+52.50*2
        System.out.println(cosCumparaturi.getProducts());  //afiseaza intreagul cos de cumparaturi, toate produsele cu proprietatile lor
        System.out.println(cosCumparaturi.produseSeparate(TYPE.CARNE)); //afiseaza intreaga lista de produse din carne
        System.out.println(cosCumparaturi.produseSeparate(TYPE.LACTATE));//afiseaza intreaga lista de produse din lapte
        System.out.println(cosCumparaturi.produseSeparate(TYPE.VEGAN));//afiseaza intreaga lista de produse vegane
        System.out.println(cosCumparaturi.calculeazaCostTip(TYPE.CARNE));//52.5*2+22.50*3
        System.out.println(cosCumparaturi.calculeazaCostTip(TYPE.LACTATE));//12*2+3.2*5*22
        System.out.println(cosCumparaturi.calculeazaCostTip(TYPE.VEGAN));//13.60+52.50*2
//353.1
//[Product{nume='carna vita', pret=52.5, cantitate=2, type=CARNE}, Product{nume='carna porc', pret=22.5, cantitate=3, type=CARNE}, Product{nume='lapte', pret=12.0, cantitate=2, type=LACTATE}, Product{nume='iaurt', pret=3.2, cantitate=5, type=LACTATE}, Product{nume='branza', pret=22.0, cantitate=1, type=LACTATE}, Product{nume='seminte', pret=13.6, cantitate=1, type=VEGAN}, Product{nume='ciocolata', pret=52.5, cantitate=2, type=VEGAN}]
//[Product{nume='carna vita', pret=52.5, cantitate=2, type=CARNE}, Product{nume='carna porc', pret=22.5, cantitate=3, type=CARNE}]
//[Product{nume='lapte', pret=12.0, cantitate=2, type=LACTATE}, Product{nume='iaurt', pret=3.2, cantitate=5, type=LACTATE}, Product{nume='branza', pret=22.0, cantitate=1, type=LACTATE}]
//[Product{nume='seminte', pret=13.6, cantitate=1, type=VEGAN}, Product{nume='ciocolata', pret=52.5, cantitate=2, type=VEGAN}]
//172.5
//62.0
//118.6


        System.out.println();
        int dimensiuneInitiala = cosCumparaturi.getProducts().size();
        cosCumparaturi.addProduct(new Product("carne", 52.50, 2, TYPE.CARNE));
        int dimensiuneDupaAdaugare = cosCumparaturi.getProducts().size();
        System.out.println(dimensiuneInitiala);
        System.out.println(dimensiuneDupaAdaugare);

    }
}
