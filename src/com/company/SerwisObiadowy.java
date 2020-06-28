package com.company;

import java.util.List;

public class SerwisObiadowy implements Serwis{


    private String numer;
    private int iloscOsob;
    private String nazwaWzoru;
    private String czas;
    private RodzajSerwisu rodzajSerwisu;
    private List<Naczynie> naczynia;


    public SerwisObiadowy(String numer, int iloscOsob, String nazwaWzoru, String czas, RodzajSerwisu rodzajSerwisu, List<Naczynie> naczynia) {
        this.numer = numer;
        this.iloscOsob = iloscOsob;
        this.nazwaWzoru = nazwaWzoru;
        this.czas = czas;
        this.rodzajSerwisu = rodzajSerwisu;
        this.naczynia = naczynia;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public String getNazwaWzoru() {
        return nazwaWzoru;
    }

    public void setNazwaWzoru(String nazwaWzoru) {
        this.nazwaWzoru = nazwaWzoru;
    }

    public String getCzas() {
        return czas;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }

    public RodzajSerwisu getRodzajSerwisu() {
        return rodzajSerwisu;
    }

    public void setRodzajSerwisu(RodzajSerwisu rodzajSerwisu) {
        this.rodzajSerwisu = rodzajSerwisu;
    }
}