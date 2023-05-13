package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class Exercitiul1_tema11_inmultireTest {
    private Exercitiul1_tema11_inmultire exercitiul1_tema11_inmultire;

    @Test
    public void testCalculInmultire() {
        exercitiul1_tema11_inmultire= new Exercitiul1_tema11_inmultire(3,5,9);
        int inmultire =exercitiul1_tema11_inmultire.inmultesteNumere();
        assertEquals(135,inmultire);

    }

}
