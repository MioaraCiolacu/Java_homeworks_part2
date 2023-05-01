package com.itfactory;

public enum LunileAnului {
    JANUARY(1, "JAN", Anotimp.IARNA),
    FEBRUARY(2, "FEB", Anotimp.IARNA),
    MARCH(3, "MAR", Anotimp.PRIMAVARA),
    APRIL(4, "APR", Anotimp.PRIMAVARA),
    MAY(5, "MAY", Anotimp.PRIMAVARA),
    JUNE(6, "JUN", Anotimp.VARA),
    JULY(7, "JUL", Anotimp.VARA),
    AUGUST(8, "AUG", Anotimp.VARA),
    SEPTEMBER(9, "SEP", Anotimp.TOAMNA),
    OCTOBER(10, "OCT", Anotimp.TOAMNA),
    NOVEMBER(11, "NOV", Anotimp.TOAMNA),
    DECEMBER(12, "DEC", Anotimp.IARNA);

    private int luna;
    private String prescurtare;
    private Anotimp anotimp;

    LunileAnului(int luna, String prescurtare, Anotimp anotimp) {
        this.luna = luna;
        this.prescurtare = prescurtare;
        this.anotimp = anotimp;
    }

    public int getLuna() {
        return luna;
    }

    public String getPrescurtare() {
        return prescurtare;
    }

    public Anotimp getAnotimp() {
        return anotimp;
    }
}


