package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P1_Internationalization_i_Localization;

import java.util.Locale;

public class P1_Internationalization_i_Localization {

    public static void main(String[] args) {
        //Internatiolization    i18n
        //Localization          l10n

        System.out.println("Siemanko");

        Locale aDefault = Locale.getDefault();
        System.out.println(aDefault);
        System.out.println(Locale.FRANCE);
        System.out.println(Locale.ENGLISH);
        System.out.println(Locale.ITALIAN);
        System.out.println(Locale.UK);
        System.out.println(Locale.US);
        System.out.println(Locale.GERMANY);
        System.out.println(Locale.GERMAN);
        System.out.println(new Locale("en", "PL"));

        Locale.setDefault(Locale.ROOT);
        System.out.println(Locale.getDefault());
    }
}
