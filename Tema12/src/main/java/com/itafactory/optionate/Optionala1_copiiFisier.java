package com.itafactory.optionate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Optionala1_copiiFisier {

    //Sa se creeze un proiect in care se cere sa se creeze copii ale unui fisier.
    //Programul va primi de la tastatura numele fisierului pentru care se va face o copie.
    //Programul va verifica daca exista fisierul pentru care se cere copia, iar daca nu, se va arunca o exceptie. (Creeati voi exceptia)
    //In cazul in care exista deja o copie a fisierului se va concatena textul "Copy" la inceputul acestuia.
    //Exemplu:
    //Scenariu 1. Se introduce numele fisierului "fisier.txt" -> Copia va fi "Copy fisier.txt"
    //Scenariu 2. Se introduce din nou numele fisierului "fisier.txt" dar deja exisa "Copy fisier.txt". Atunci noua copie va fi "Copy Copy fisier.txt"
    //Scenariu 3. Se introduce din nou numele fisierului "fisier.txt" dar deja exisa "Copy Copy fisier.txt". Atunci noua copie va fi "Copy Copy Copy fisier.txt"
    //etc....

    public static void main(String[] args) throws FisierInexistentException, IOException {
//        Path source = Paths.get("fisier.txt");       //fisierul original
//        Path destination = Paths.get("fisier-copie.txt");   //fisierul 2, de destinatie,sau copia celui dintai
//        Files.copy(source, destination);   //arunca eroare, acest fisier nu exista

        //

//        Path source1 = Paths.get("cuvinte.txt");
//        Path destination1 = Paths.get("Copy " + "cuvinte.txt");
//        Files.copy(source1, destination1);  //arunca eroare, acest fisier deja exista


        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numele fisierului:");
        String numeFisier = sc.nextLine();


        // Verificam daca exista fisierul original
        Path source = Paths.get(numeFisier);
//        if (!Files.exists(source)) {
//            throw new FisierInexistentException("Nu avem acest fisier");
//        }


        //sau pot folosi si:
        if (!(numeFisier.equalsIgnoreCase("cuvinte.txt") || (numeFisier.equalsIgnoreCase("numere.txt") ||
                (numeFisier.equalsIgnoreCase("problema4.txt"))))) {
            throw new FisierInexistentException("Nu avem acest fisier");

        }

        // Cream numele fisierului de destinatie
        Path destination = Paths.get("Copy " + numeFisier);
        int numarCopii = 0;

        // Verificam daca exista fisierul de destinatie si adaugam numarul de copii inaintea numelui fisierului
        while (Files.exists(destination)) {  //while (Files.exists(Paths.get("Copy " + numeFisier)))
            numarCopii++;
            destination = Paths.get("Copy ".repeat(numarCopii) + " " + numeFisier);
        }

        // Copiem fisierul
        Files.copy(source, destination);
        System.out.println("Fisierul copiat este: " + destination);

    }


}
