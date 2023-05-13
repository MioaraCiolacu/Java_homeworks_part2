package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class Exercitiul1_tema11_moduloTest {
    private Exercitiul1_tema11_modulo exercitiul1_tema11_modulo;

    @Test
    public void testCalculeazaModulo(){
        exercitiul1_tema11_modulo =new Exercitiul1_tema11_modulo(5,9);
        int modulo=exercitiul1_tema11_modulo.moduloNumere();
        assertEquals( 5, modulo);

        //sau pot folosi si:
        assertFalse(modulo != 5);
    }

}
