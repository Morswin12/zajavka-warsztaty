package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Purchase {
    private final BigDecimal id_porzadkowe_zakupu;
    private final Osoba osoba;
    private final Samochod samochod;
    private final Lokalizacja lokalizacja;
    private final LocalDate data_zakupu;

    public Purchase(BigDecimal id_porzadkowe_zakupu, Osoba osoba, Samochod samochod, Lokalizacja lokalizacja, LocalDate data_zakupu) {
        this.id_porzadkowe_zakupu = id_porzadkowe_zakupu;
        this.osoba = osoba;
        this.samochod = samochod;
        this.lokalizacja = lokalizacja;
        this.data_zakupu = data_zakupu;
    }

    public BigDecimal getId_porzadkowe_zakupu() {
        return id_porzadkowe_zakupu;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public Lokalizacja getLokalizacja() {
        return lokalizacja;
    }

    public LocalDate getData_zakupu() {
        return data_zakupu;
    }

    @Override
    public String toString() {
        return "\n\nTransakcja numer: " + id_porzadkowe_zakupu +
                "! \nKupujący=" + osoba +
                ", \nsamochod=" + samochod +
                ", \ndata_zakupu=" + data_zakupu + " \nLokalizacja: " + lokalizacja;
    }
}
