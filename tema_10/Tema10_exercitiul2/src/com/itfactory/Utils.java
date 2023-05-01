package com.itfactory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static void afiseazaDetaliiSeparateZiNastere(int numarLuna) {
        for (LunileAnului value : LunileAnului.values()) {
            if (value.getLuna() == numarLuna) {
                System.out.println(value.name() + " : " + value.getPrescurtare() + " : " + value.getAnotimp().name());
                break;
            }
        }
    }


//pot folosi metoda de mai jos sa afisez detaliile pentru fiecare luna in parte, expl:
// Luna anului este: MARCH
//Prescurtarea lunii este: MAR
//Anotimpul este: PRIMAVARA
//Luna este: 3

    public static void afiseazaSeparatElementele() {
        for (LunileAnului luna : LunileAnului.values()) {
            System.out.println("Luna anului este: " + luna.name());
            System.out.println("Prescurtarea lunii este: " + luna.getPrescurtare());
            System.out.println("Anotimpul este: " + luna.getAnotimp());
            System.out.println("Luna este: " + luna.getLuna());
            System.out.println();
        }
    }


}
