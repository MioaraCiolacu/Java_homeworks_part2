package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class Exercitiul1_tema11_adunareTest {
    private Exercitiul1_tema11_suma exercitiul1_tema11_suma;

    @Test
    public void testCalculeazaSuma(){
        exercitiul1_tema11_suma =new Exercitiul1_tema11_suma(84,2);
        int suma=exercitiul1_tema11_suma.calculeazaSuma();
        assertEquals(86,suma);

    }
}
