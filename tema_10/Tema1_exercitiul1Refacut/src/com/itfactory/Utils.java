package com.itfactory;

import java.util.List;
import java.util.Scanner;


public class Utils {
    public static void readPerson(List<Persoana> currentList, Scanner scanner) throws CitirePersoanaException {
        System.out.print("Introduceti functia detinuta: 1 - Doctor, 2 - Asistent, 3 - Pacient: ");
        Calitate functie;
        int functiaDetinuta = Integer.parseInt(scanner.nextLine());
        switch (functiaDetinuta) {
            case 1: {
                int doctors = 0;
                for (Persoana person : currentList) {
                    if (person.getFunctie() == Calitate.DOCTOR) {
                        doctors++;
                    }
                }
                if (doctors == 3) {
                    throw new CitirePersoanaException("Avem deja 3 doctori in sistem. ");
                }
                functie = Calitate.DOCTOR;
            }
            break;
            case 2: {
                int assistent = 0;
                for (Persoana person : currentList) {
                    if (person.getFunctie() == Calitate.ASISTENT) {
                        assistent++;
                    }
                }
                if (assistent == 5) {
                    throw new CitirePersoanaException("Avem deja 5 asistenti in sistem. ");
                }
                functie = Calitate.ASISTENT;

            }
            break;
            case 3: {
                functie = Calitate.PACIENT;
            }
            break;
            default: {
                throw new CitirePersoanaException("Nu avem o alta functie in sistem");
            }
        }

        System.out.print("Introduceti numele: ");
        String nume = scanner.nextLine();

        currentList.add(new Persoana(functie, nume));
    }


    public static boolean checkIfPersonalCanBeAdded(List<Persoana> currentList, int maxPersonal, Calitate type) throws CitirePersoanaException {
        int personal = 0;
        for (Persoana person : currentList) {
            if (type == person.getFunctie()) {
                personal++;
            }
        }
        if (personal == maxPersonal) {
            throw new CitirePersoanaException("Nu putem depasi numarul maxim permis.");
        }
        return true;
    }

    public static void printPersonal(List<Persoana> currentList, Calitate functie) {
        int number = 0;
        for (Persoana person : currentList) {
            if (functie.equals(person.getFunctie())) {
                System.out.println(person);
                number++;
            }
        }

        System.out.println("Avem " + number + " persoane care corespund cerintei");
        System.out.println();
    }

    public static void help() {
        System.out.println("Ajutor pentru optiuni: Pentru 0  se iese din program\n" + " 1 - se afiseaza mesaj de help\n" + " 2 - se citeste o persoana\n" + " 3 - se afiseaza lista de pacienti\n" + " 4 - se afiseaza lista de medici si numarul lor\n" + " 5 - se afiseaza lista de asistenti si numarul lor\n");
    }

}