package WARSZTATY.MOJ_NOTATNIK.Kursy_Walut;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 4, 17);
        WczytajKursNBP_DlaPodanejDaty wczytanyKursZNBP = new WczytajKursNBP_DlaPodanejDaty(localDate);
        String szukanyKurs = wczytanyKursZNBP.getSzukany_kurs();
        System.out.println(szukanyKurs);
        System.out.println(wczytanyKursZNBP.getKursWDouble());
        System.out.println(wczytanyKursZNBP.getDatePierwszegoKursu());
        System.out.println(wczytanyKursZNBP.getPodanaData());

    }
}
