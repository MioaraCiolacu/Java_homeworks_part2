package com.itfactory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti data nasterii in format dd-mm-yyyy:");
        String dataNasterii = sc.nextLine();

        //creem un pattern pentru data nasterii in format dd-MM-yyyy
        String regex = "^\\d{2}-\\d{2}-\\d{4}$";
        //First, the pattern is created using the Pattern.compile() method.
        // The first parameter indicates which pattern is being
        // searched for and the second parameter has a flag to indicates that the search
        // should be case-insensitive. The second parameter is optional.
        Pattern pattern = Pattern.compile(regex); //sau pot scrie direct: Pattern pattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
        Matcher matcher = pattern.matcher(dataNasterii);//The matcher() method is used to search for the pattern in a string.
        // It returns a Matcher object which contains information
        // about the search that was performed.
        boolean matchFound = matcher.find();            //The find() method returns true if the pattern was found in the string and false if it was not found.
        if (matchFound) {
            System.out.println("Format corect");
        } else {
            System.out.println("Format incorect");
        }

        // sau in loc de if else de mai sus, pot folosi si aceasta varianta:
        if (!matcher.matches()) {
            System.out.println("Data introdusa nu are formatul corect.");
        }

        String[] componente = dataNasterii.split("-");
        int numarLuna = Integer.parseInt(componente[1]);  // preia al doilea element din vectorul componente (adică numarul lunii), și
        // il transforma intr-un numar intreg utilizand metoda parseInt() din clasa Integer.

        if (numarLuna < 1 || numarLuna > 12) {
            System.out.println("Din pacate, nu ati introdus o luna valida");
        }
        Utils.afiseazaDetaliiSeparateZiNastere(numarLuna);

        System.out.println();
        System.out.println();

//apelarea metodei de a afisa toate detaliile pentru toate cele 12 luni:

        Utils.afiseazaSeparatElementele();


        // pot crea si metoda separat de validare date:
        // public static void validareDate() throws Exception{
        //        Scanner sc = new Scanner(System.in);
        //        System.out.println("Va rugam sa introduceti data nasterii in format dd-mm-yyyy:");
        //        String dataNasterii = sc.nextLine();
        //        String regex = "^\\d{2}-\\d{2}-\\d{4}$";
        //        Pattern pattern = Pattern.compile(regex);
        //        Matcher matcher = pattern.matcher(dataNasterii);
        //        boolean matchFound = matcher.find();
        //        if (matchFound) {
        //            System.out.println("Format corect");
        //        } else {
        //            throw new Exception("Format incorect");
        //        }
        //    }
    }
}
