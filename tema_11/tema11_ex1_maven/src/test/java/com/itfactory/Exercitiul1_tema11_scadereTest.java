package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static org.testng.Assert.assertNotEquals;

public class Exercitiul1_tema11_scadereTest {
    private Exercitiul1_tema11_scadere exercitiul1_tema11_scadere;

    @Test
    public void testCalculeazaScadere() {
        exercitiul1_tema11_scadere = new Exercitiul1_tema11_scadere(955,75,100);
        int scadere= exercitiul1_tema11_scadere.scadeNumere();
        assertFalse(scadere!=780);
        assertNotNull(scadere);
        assertNotEquals(781, scadere);  //ca aceasta sa faca ca testul meu sa treaca, valoarea 781 va trebui sa fie falsa, intrucat rezultatul corect este 780
    }


}
