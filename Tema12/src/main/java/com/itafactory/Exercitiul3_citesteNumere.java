package com.itafactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercitiul3_citesteNumere {
    public static void main(String[] args) throws IOException {
        //Sa se creeze un program simplu prin care se citesc dintr-un fisier "numere.txt" doua numere de tip int si se afiseaza suma lor.
        Path path = Paths.get("numere.txt");
        List<String> continut = Files.readAllLines(path);
        System.out.println(continut); // [5, 6], afiseaza continutul intregii liste
        System.out.println();

        int suma = 0;
        for (String linie : continut) {
            int numar = Integer.parseInt(linie);  //fac conversia fiecarul element de tip String din lista mea, in integer
            suma += numar;
            System.out.println(suma);
        }
    }
}//[5, 6]

//5  , prima data afiseaza prima suma 0+5=5;
//11, urmatorul pas, aduma la suma 5 pe 6 si va da 11
