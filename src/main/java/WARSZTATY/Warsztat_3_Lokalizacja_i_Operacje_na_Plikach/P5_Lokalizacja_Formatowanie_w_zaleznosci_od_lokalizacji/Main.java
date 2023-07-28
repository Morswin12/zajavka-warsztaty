package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P5_Lokalizacja_Formatowanie_w_zaleznosci_od_lokalizacji;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int number = 1_234_567;

        Locale localePL = new Locale("pl", "PL");
        Locale localeIS = new Locale("is", "IS");
        Locale localeUS = Locale.US;
        Locale localeUK = Locale.UK;
        Locale localeGERMANY = Locale.GERMANY;

        System.out.println("NumberFormat.getInstance()");
        System.out.println("PL: " + NumberFormat.getInstance(localePL).format(number));
        System.out.println("IS: " + NumberFormat.getInstance(localeIS).format(number));
        System.out.println("Uk: " + NumberFormat.getInstance(localeUK).format(number));
        System.out.println("US: " + NumberFormat.getInstance(localeUS).format(number));
        System.out.println("Germany: " + NumberFormat.getInstance(localeGERMANY).format(number));
        System.out.println();

        System.out.println("NumberFormat.getNumberInstance()");
        System.out.println("PL: " + NumberFormat.getNumberInstance(localePL).format(number));
        System.out.println("IS: " + NumberFormat.getNumberInstance(localeIS).format(number));
        System.out.println("US: " + NumberFormat.getNumberInstance(localeUS).format(number));
        System.out.println("Germany: " + NumberFormat.getNumberInstance(localeGERMANY).format(number));
        System.out.println();

        System.out.println("NumberFormat.getPercentInstance()");
        System.out.println("PL: " + NumberFormat.getPercentInstance(localePL).format(number));
        System.out.println("IS: " + NumberFormat.getPercentInstance(localeIS).format(number));
        System.out.println("US: " + NumberFormat.getPercentInstance(localeUS).format(number));
        System.out.println("UK: " + NumberFormat.getPercentInstance(localeUK).format(number));
        System.out.println("Germany: " + NumberFormat.getPercentInstance(localeGERMANY).format(number));
        System.out.println();

        System.out.println("NumberFormat.getCurrencyInstance()");
        System.out.println("PL: " + NumberFormat.getCurrencyInstance(localePL).format(number));
        System.out.println("IS: " + NumberFormat.getCurrencyInstance(localeIS).format(number));
        System.out.println("US: " + NumberFormat.getCurrencyInstance(localeUS).format(number));
        System.out.println("UK: " + NumberFormat.getCurrencyInstance(localeUK).format(number));
        System.out.println("Germany: " + NumberFormat.getCurrencyInstance(localeGERMANY).format(number));
        System.out.println();
    }
}
