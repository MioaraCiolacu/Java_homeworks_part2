package com.itfactory;

public class Main {

    //Problema 1.
    //Sa se creeze un mic proiect in care se va crea o clasa ce va face operatii. (Adunare scadere +
    // alte operatii simple la alegere)
    //Creati un test unitar in care sa se testeze fiecare metoda. (puteti face doar un test sau  un test
    // pentru fiecare metoda, la alegere)
    public static void main(String[] args) {
        Exercitiul1_tema11_impartire impartire = new Exercitiul1_tema11_impartire(5, 9);
        System.out.println(impartire.imparteNumere());

        Exercitiul1_tema11_inmultire immultire = new Exercitiul1_tema11_inmultire(3, 5, 9);
        System.out.println(immultire.inmultesteNumere());

        Exercitiul1_tema11_media medie = new Exercitiul1_tema11_media(5, 9, 20);
        System.out.println(medie.medieNumere());


        Exercitiul1_tema11_modulo modulo = new Exercitiul1_tema11_modulo(5, 9);
        System.out.println(modulo.moduloNumere());

        Exercitiul1_tema11_scadere scadere=new Exercitiul1_tema11_scadere(955,75,100);
        System.out.println(scadere.scadeNumere());

        Exercitiul1_tema11_suma suma=new Exercitiul1_tema11_suma(84,2);
        System.out.println(suma.calculeazaSuma());


    }
}
