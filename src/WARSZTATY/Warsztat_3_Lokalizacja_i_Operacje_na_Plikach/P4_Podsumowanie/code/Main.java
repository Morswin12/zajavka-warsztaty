package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P4_Podsumowanie.code;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pl", "PL"));
        ResourceBundle translations = ResourceBundle.getBundle("translations");
        ResourceBundle translations2 = ResourceBundle.getBundle("translations", new Locale("de", "DE"));

        System.out.println(translations2.getString("exampleKey"));


        System.out.println(translations.containsKey("exampleKey"));
        System.out.println(translations.keySet());
        System.out.println(translations.getString("justKey"));
        System.out.println(translations.getString("otherKey"));
        System.out.println(translations.getLocale());

        String justKey = translations.getString("justKey");
        System.out.printf(justKey, "gorororo");
        System.out.println();

    }
}
