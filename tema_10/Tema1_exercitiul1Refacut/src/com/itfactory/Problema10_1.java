package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema10_1 {

    //Problema 1.
    //
    //Sa se creeze un program prin care se gestioneaza un personal de pacienti.
    //Se va crea o clasa ce va stoca date despre o persoana percum si titlul acesteia (pacient, medic, asistent ce va fi definit de un ENUM)
    //
    //
    //Se va crea o clasa Utils in care se vor crea metode statice pentru gestiunea unor liste de persoane.
    //* O metoda ce primeste lista de persoane si filtreaza dupa o categorie persoanele (pacienti, medici, asistenti) si returneaza lista
    //* O metoda ce citeste o persoana de la tastatura. Se va tine cont ca in spital pot fi maxim 3 medici si 5 asitenti, daca se depasesc aceste limite se va arunca o exceptie.
    //*** pentru optimizarea codului, optional, se poate crea o metoda care verifica daca pe baza unui numar maxim si tipul de persoana lista poate adauga in plus o persoana de acel tip.
    //
    //
    //Se va crea o consola interactiva intr-o metoda main cu urmatoarele actiuni:
    // 0 - iese din program
    // 1 - afiseaza mesaj de help
    // 2 - citeste o persoana
    // 3-  afiseaza lista de pacienti
    // 4 - afiseaza lista de medici si numarul lor
    // 5 - afiseaza lista de asistenti si numarul lor
    //
    //pentru a detasa codul si a-l aerisi creati cat mai multe metode statice in main.


    public static void main(String[] args) throws CitirePersoanaException {
        List<Persoana> currentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Utils.help();

        while (true) {
            System.out.print("Introduceti optiunea: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0: {
                    System.out.println("Ati iesit din program");
                    scanner.close();
                    System.exit(0);
                }
                break;
                case 1: {
                    Utils.help();
                }
                break;
                case 2: {
                    try {
                        Utils.readPerson(currentList, scanner);
                    } catch (CitirePersoanaException e) {
                        System.out.println("A aparut o exceptie: " + e.getMessage());
                    }
                }
                break;
                case 3: {
                    Utils.printPersonal(currentList, Calitate.PACIENT);
                }
                break;
                case 4: {
                    Utils.printPersonal(currentList, Calitate.DOCTOR);
                    try {
                        Utils.checkIfPersonalCanBeAdded(currentList, 3, Calitate.DOCTOR);
                    } catch (CitirePersoanaException e) {
                        System.out.println("A aparut o exceptie: " + e.getMessage());
                    }

                }
                break;
                case 5: {
                    Utils.printPersonal(currentList, Calitate.ASISTENT);
                    try {
                        Utils.checkIfPersonalCanBeAdded(currentList, 3, Calitate.DOCTOR);
                    } catch (CitirePersoanaException e) {
                        System.out.println("A aparut o exceptie: " + e.getMessage());
                    }
                }
                break;
                default: {
                    scanner.close();
                    throw new CitirePersoanaException("Nu exista aceasta optiune");
                }
            }
        }
    }


}

