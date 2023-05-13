package com.itfactory;

/**
 * Hello world!
 */
public class Exercitiul1_tema11_suma {
    //Problema 1.
    // Sa se creeze un mic proiect in care se va crea o clasa ce va face operatii. (Adunare scadere + alte operatii simple la alegere)
    // Creati un test unitar in care sa se testeze fiecare metoda. (puteti face doar un test sau  un test pentru fiecare metoda, la alegere)


        private int numar1;
        private int numar2;


        public Exercitiul1_tema11_suma(int numar1, int numar2) {
                this.numar1 = numar1;
                this.numar2 = numar2;
        }

        public int calculeazaSuma(){
                return numar1+numar2;
        }


}
