package com.itfactory;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class Exercitiul1_tema11_impartireTest {
    private Exercitiul1_tema11_impartire exercitiul1_tema11_impartire;

    @Test
    public void testCalculImpartire(){
        exercitiul1_tema11_impartire= new Exercitiul1_tema11_impartire(5,9);
        double impartire=exercitiul1_tema11_impartire.imparteNumere();
        assertEquals (0.5555, impartire,0.0001);  //unde delta reprezinta precizia, intrucat rezultatul este cu multe cifre dupa virgula


        //sau pot folosi si metoda assertThat, dupa ce am importat clasa corespunzatoare si dependinta necesara
        assertThat(impartire, is(closeTo(0.556, 0.001)));


    }






}
