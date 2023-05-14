package com.itafactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercitiul4_citesteLinii {
    public static void main(String[] args) throws IOException {
        //Sa se creeze un program prin care se citesc dintr-un fisier liniile acestuia (folosind metoda de la Exemplul 2). "problema4.txt"
        //Se cere ca sa se introduca intr-o lista doar liniile din fisier care nu contin litere mari.

        Path path = Paths.get("problema4.txt");
        List<String> continut = Files.readAllLines(path);
        System.out.println(continut);  //[Astazi merg la magazin, astazi o sa raman acasa sa rezolv tema, azorel se Joaca cu mingea, imi place sa programez in java]

        System.out.println();
        for (String cuvant : continut) {
            if (cuvant.contains("tema")) {
                System.out.println(cuvant);  //astazi o sa raman acasa sa rezolv tema
            }

        }

        //Afisare elemente care incep cu litera mare:
        System.out.println();
        for (String element : continut) {
            if (Character.isUpperCase(element.charAt(0))) {
                System.out.println(element);
            }
        }
        //Astazi merg la magazin



        //Afisare elemente care incep cu litera mica:
        System.out.println();
        for (String element : continut) {
            if (Character.isLowerCase(element.charAt(0))) {
                System.out.println(element);
            }
        }
        //astazi o sa raman acasa sa rezolv tema
        //azorel se Joaca cu mingea
        //imi place sa programez in java

    }
}

