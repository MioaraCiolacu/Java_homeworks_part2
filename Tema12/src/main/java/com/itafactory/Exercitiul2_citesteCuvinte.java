package com.itafactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercitiul2_citesteCuvinte {
    public static void main(String[] args) throws IOException {
        //Sa se creeze un program simplu prin care se citesc dintr-un fisier "cuvinte.txt" texte de pe fiecare linie.
        // (Se va citi cu metoda de la Exemplu1 de la curs)
        //Se cere sa se parcurga lista de cuvinte citita din fisier si sa se afiseze doar cuvintele care contin litera "a"


        Path path = Paths.get("cuvinte.txt");
        List<String> continut = Files.readAllLines(path);
        System.out.println(continut);  //[masina, cana, avion, laptop, monitor, mouse, portofel]


        for (String cuvant : continut) {
            if (cuvant.contains("a")) {
                System.out.println(cuvant);
            }

        }
        //masina
        //cana
        //avion
        //laptop

    }
}
