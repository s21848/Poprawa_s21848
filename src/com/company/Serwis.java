package com.company;

import java.util.Collections;
import java.util.List;

public interface Serwis {
    String numer = null;
    int iloscOsob = 0;
    String nazwaWzoru = null;
    String czas = null;
    RodzajSerwisu rodzajSerwisu = RodzajSerwisu.NAZAMOWIENIE;
    List<Naczynie> naczynia = Collections.emptyList();

    String getNumer();
    void setNumer(String number);
    String getNazwaWzoru();
    void setNazwaWzoru(String nazwaWzoru);
    String getCzas();
    void setCzas(String czas);
    int getIloscOsob();
    void setIloscOsob(int iloscOsob);
}


