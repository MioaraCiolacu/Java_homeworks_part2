package com.itfactory;

import org.testng.annotations.Test;

import java.util.List;

import static junit.framework.Assert.*;
import static org.testng.Assert.assertNotEquals;

public class BasketTest {

    //a. Un test ce verifica daca adauga corect un produs. (Dupa ce adaugam dimensiunea listei trebuie sa creasca)
    private Basket cos;

    @Test
    public void testAdaugaProdus() {
        cos = new Basket();
        int dimensiuneInitiala = cos.getProducts().size();
        cos.addProduct(new Product("carne vita", 52.50, 2, TYPE.CARNE));
        int dimensiuneDupaAdaugare = cos.getProducts().size();
        assertEquals(dimensiuneInitiala + 1, dimensiuneDupaAdaugare);

        //sau in acest caz, pot pune si asa:
        assertEquals(1, 1);

        //daca mai adaug un produs:
        cos.addProduct(new Product("carne vita", 52.50, 2, TYPE.CARNE));
        assertNotEquals(1, 2);

        //sau
        assertFalse(cos.getProducts().isEmpty());
    }


    //b. Un test ce verifica produsele selectate pe baza unui tip. //
    // (comparam doua liste. atentie la metodele equals/hashcode---se va face in clasa Product)

    @Test
    public void testVerificaProduseSeparate() {
        cos = new Basket();
        cos.addProduct(new Product("carne vita", 52.50, 2, TYPE.CARNE));
        cos.addProduct(new Product("iaurt", 3.20, 5, TYPE.LACTATE));
        cos.addProduct(new Product("branza", 22.00, 1, TYPE.LACTATE));
        cos.addProduct(new Product("seminte", 13.60, 1, TYPE.VEGAN));

        List<Product> byCarne = cos.produseSeparate(TYPE.CARNE);
        List<Product> byLactate = cos.produseSeparate(TYPE.LACTATE);
        List<Product> byVegan = cos.produseSeparate(TYPE.VEGAN);
        assertEquals(1, byCarne.size());
        assertNotNull(byLactate);
        assertFalse(byVegan.isEmpty());
        assertTrue(byVegan.size() == 1);

        assertNotSame(byVegan, byCarne);
        assertTrue(cos.getProducts().containsAll(byLactate));
        // pentru metoda de mai jos, ca sa fie ok si sa treaca testul, este necesar sa facem override la metoda equals si hashcode din clasa Product:
        assertTrue(cos.getProducts().contains(new Product("branza", 22.00, 1, TYPE.LACTATE)));

    }


    //c. Un test ce verifica calculul total.

    @Test
    public void testVerificaCalculTotal() {
        cos = new Basket();
        cos.addProduct(new Product("carna vita", 52.50, 2, TYPE.CARNE));
        cos.addProduct(new Product("carna porc", 22.50, 3, TYPE.CARNE));
        cos.addProduct(new Product("lapte", 12.0, 2, TYPE.LACTATE));
        cos.addProduct(new Product("iaurt", 3.20, 5, TYPE.LACTATE));
        cos.addProduct(new Product("branza", 22.00, 1, TYPE.LACTATE));
        cos.addProduct(new Product("seminte", 13.60, 1, TYPE.VEGAN));
        cos.addProduct(new Product("ciocolata", 52.50, 2, TYPE.VEGAN));

        assertEquals(52.5*2+22.5*3+12*2+3.2*5+22*1+13.6*1+52.5*2,cos.getTotal());

    }


    //d. un test ce verifica costul pentru un tip de produse.

    @Test
    public void testVerificaCalculSeparatProduse() {
        cos = new Basket();
        cos.addProduct(new Product("carna vita", 52.50, 2, TYPE.CARNE));
        cos.addProduct(new Product("carna porc", 22.50, 3, TYPE.CARNE));
        cos.addProduct(new Product("lapte", 12.0, 2, TYPE.LACTATE));
        cos.addProduct(new Product("iaurt", 3.20, 5, TYPE.LACTATE));
        cos.addProduct(new Product("branza", 22.00, 1, TYPE.LACTATE));
        cos.addProduct(new Product("seminte", 13.60, 1, TYPE.VEGAN));
        cos.addProduct(new Product("ciocolata", 52.50, 2, TYPE.VEGAN));
        assertEquals(52.5*2+22.5*3,cos.calculeazaCostTip(TYPE.CARNE));
        assertEquals(12*2+3.2*5+22*1,cos.calculeazaCostTip(TYPE.LACTATE));
        assertEquals(13.6*1+52.5*2,cos.calculeazaCostTip(TYPE.VEGAN));

    }

    }


