package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P3_Resource_bundle.code;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main2 {
    public static void main(String[] args) {
        // 1 Store_en_EN.java Szukamy podanego pliku
        // 2 Store_en_EN.properties Szukamy podanego pliku
        // 3 Store_en.java Jeżeli pliku wyżej nie ma, szukamy pliu tylko z językiem, bez kraju
        // 4 Store_en.properties Jeżeli pliku wyżej nie ma, szukamy pliu tylko z językiem, bez kraju
        // 5 Store_pl_PL.java Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale
        // 6 Store_pl_PL.properties Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale
        // 7 Store_pl.java Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale, ale bez kraju
        // 8 Store_pl.properties Jeżeli pliku wyżej nie ma, szukamy defaultowego Locale, ale bez kraju
        // 9 Store.java Jeżeli pliku wyżej nie ma, szukamy pliku bez Locale
        // 10 Store.properties Jeżeli pliku wyżej nie ma, szukamy pliku bez Locale
        // 11 Jeżeli nie znaleziono żadnego pliku to zostaje wyrzucony MissingResourceException


        Locale.setDefault(new Locale("pl", "PL"));
        System.out.println("DefaultLocal: " + Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Store", new Locale( "en", "US"));
        String mainPage = resourceBundle.getString("mainPage");
        String footer = resourceBundle.getString("footer");

        System.out.println("mainPage: " + mainPage);
        System.out.println("footer: " + footer);
    }
}
