package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P6_Podsumowanie;

import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2020, 4, 23, 14, 34, 45, 0,
                ZoneId.of("Poland")
        );

        System.out.println(zonedDateTime);
        DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.FRENCH);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ENGLISH);
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.GERMANY);
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.CHINA);

        System.out.println(zonedDateTime.format(dateTimeFormatter0));
        System.out.println(zonedDateTime.format(dateTimeFormatter1));
        System.out.println(zonedDateTime.format(dateTimeFormatter2));
        System.out.println(zonedDateTime.format(dateTimeFormatter3));
        System.out.println(zonedDateTime.format(dateTimeFormatter4));

        int number = 12_345_678;

        System.out.println(NumberFormat.getInstance(Locale.ENGLISH).format(number));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(number));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(number));
        System.out.println(NumberFormat.getPercentInstance(Locale.GERMANY).format(number));
    }
}
