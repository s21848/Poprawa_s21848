package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ZAD1
        List<Naczynie> listaNaczynZad1 = new ArrayList<>();
        listaNaczynZad1.add(new Naczynie("talerz", 2, "300ml", 150));
        listaNaczynZad1.add(new Naczynie("maly talerz", 4, "100ml", 100));

        SerwisObiadowy serwisZad1 = new SerwisObiadowy("AD232", 2, "fale-błękitne", "10h", RodzajSerwisu.SERWISTYPOWY, listaNaczynZad1);

        //ZAD2
        List<Naczynie> listaNaczynZad2 = new ArrayList<>();
        listaNaczynZad2.add(new Naczynie("filizanki", 2, "100ml", 150));
        listaNaczynZad2.add(new Naczynie("spodki", 2, null, 100));

        SerwisDoKawy serwisDoKawyZad2 = new SerwisDoKawy("AK232", 2, "czarny-geometryczny", "15h", RodzajSerwisu.NAZAMOWIENIE, listaNaczynZad2);

        //ZAD3
        System.out.println(serwisDoKawyZad2.toString());

        Zamowienie zamowienie1 = new Zamowienie();
    }
}
