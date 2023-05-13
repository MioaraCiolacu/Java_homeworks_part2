package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Exercitiul1_tema11_mediaTest {
    private Exercitiul1_tema11_media exercitiul1_tema11_media;

    @Test
    public void testCalculMedie() {
        exercitiul1_tema11_media = new Exercitiul1_tema11_media(5.0, 9.0, 20.0);
        double medie = exercitiul1_tema11_media.medieNumere();
        assertEquals(11.3333, medie,0.0001);

        //sau pot folosi si assertThat
        assertThat(medie, is(closeTo(11.3333, 0.001)));

        //sau assertTrue
        assertTrue(Math.abs(11.3333 - medie) < 0.001);
    }
}
