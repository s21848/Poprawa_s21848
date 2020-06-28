package com.company;


    public class Naczynie {
        private String nazwa;
        private int iloscOsob;
        private String pojemnosc;
        private int cena;

        public Naczynie(String nazwa, int iloscOsob, String pojemnosc, int cena) {
            this.nazwa = nazwa;
            this.iloscOsob = iloscOsob;
            this.pojemnosc = pojemnosc;
            this.cena = cena;
        }

        public String getNazwa() {
            return nazwa;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public int getIloscOsob() {
            return iloscOsob;
        }

        public void setIloscOsob(int iloscOsob) {
            this.iloscOsob = iloscOsob;
        }

        public String getPojemnosc() {
            return pojemnosc;
        }

        public void setPojemnosc(String pojemnosc) {
            this.pojemnosc = pojemnosc;
        }

        public int getCena() {
            return cena;
        }

        public void setCena(int cena) {
            this.cena = cena;
        }
    }

