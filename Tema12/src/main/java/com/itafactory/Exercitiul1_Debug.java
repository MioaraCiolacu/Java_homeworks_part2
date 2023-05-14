package com.itafactory;

import java.util.Scanner;

public class Exercitiul1_Debug {
//    Problema 1.
//    Se cere sa se creeze un program simplu in care se citesc de la tastatura doua numere de tip int si se afiseaza suma lor.
//    Se cere sa se faca debug pe fiecare linie pentru exercitiu. (Incercati de mai multe ori folosind si F8 si F9 ca la curs).


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul nr.: ");
        int nr1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduceti al doilea nr.: ");
        int nr2 = Integer.parseInt(sc.nextLine());

        System.out.println("suma nr este: " + (nr1 + nr2));


//        int n1=2;
//        int n2=5;
//        System.out.println("suma nr este: " + (n1 + n2));
//
//
//
//        int n3=2;
//        int n4=1;
//        System.out.println("suma nr este: " + (n3 + n4));
    }
}
