package com.itafactory.optionate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ServiciiCitire_fisierGol {
    public static void main(String[] args) throws IOException {
        //Sa se scrie un program prin care se creeaza o clasa de ServiciiCitire prin care se vor citi date din fisiere.
        //In aceasta clasa se cere sa se creeze:
        //    a. O metoda care verifica daca un fisier este gol sau nu. (metoda va primi ca parametru numele/calea fisierului si va returna boolean)
        //    b. O metoda care verifica daca un anumit fisier contine un anumit cuvant. (metoda ca primi ca parametrii
        //    numele/calea fisierului, un String ce va reprezenta cuvantul cautat si va returna boolean).

        Path path = Paths.get("fisierGol.txt");
        List<String> continut = Files.readAllLines(path);
        ServiciiCitire_fisierGol serviciiCitire_fisierGol = new ServiciiCitire_fisierGol();


//       mod 1 de a afisa
//            boolean suntCuvinte = serviciiCitire_fisierGol.continutText(continut);  //pentru a afisa ce contine fisierul meu
//        if (suntCuvinte) {
//            System.out.println("Lista contine elemente.");
//        } else {
//            throw new IOException("Lista nu contine elemente.");
//        }
//    }


        //mod 2 de a afisa:
        if (continut.isEmpty()) {
            throw new IOException("Lista nu contine elemente.");
        } else {
            System.out.println("Lista contine elemente.");
        }
    }


    public static boolean continutText(List<String> continut) throws IOException {
        System.out.println(continut);
        for (String cuvant : continut) {
            for (int i = 0; i < cuvant.length(); i++) {
                if ((!Character.isLetter(cuvant.charAt(i))) && (!Character.isDigit(cuvant.charAt(i)))) {
                    // Dacă există cel puțin un caracter care nu este litera/numar, lista e goala
                    return false;
                }
            }
        }
        // Toate elementele din lista sunt cuvinte/numere
        return true;
    }
}
