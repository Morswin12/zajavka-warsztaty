package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P5_Lokalizacja_Formatowanie_w_zaleznosci_od_lokalizacji;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {

//        Locale.setDefault(new Locale("de","DE"));
        Locale.setDefault(new Locale("pl","PL"));
//        Locale.setDefault(Locale.CHINESE);

        LocalDate localDate = LocalDate.of(2023, 06, 11);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(3));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Poland"));

        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(offsetDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        DateTimeFormatter dateTimeFormatterFULL = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dateTimeFormatterLONG = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter dateTimeFormatterMEDIUM = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter dateTimeFormatterSHORT = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println();
        System.out.println("FULL: " + localDate.format(dateTimeFormatterFULL));
        System.out.println("LONG: " + localDate.format(dateTimeFormatterLONG));
        System.out.println("MEDIUM: " + localDate.format(dateTimeFormatterMEDIUM));
        System.out.println("SHORT: " + localDate.format(dateTimeFormatterSHORT));

        DateTimeFormatter TimeFormatterFULL = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter TimeFormatterLONG = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
        DateTimeFormatter TimeFormatterMEDIUM = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        DateTimeFormatter TimeFormatterSHORT = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        System.out.println();
//        System.out.println("FULL: " + localTime.format( TimeFormatterFULL));  nie da się bo nie ma zone
//        System.out.println("LONG: " + localTime.format( TimeFormatterLONG));
        System.out.println("MEDIUM: " + localTime.format(TimeFormatterMEDIUM));
        System.out.println("SHORT: " + localTime.format(TimeFormatterSHORT));

        DateTimeFormatter dTFormatterFULL = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter dTFormatterLONG = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter dTFormatterMEDIUM = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter dTFormatterSHORT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println();
//        System.out.println("FULL: " + localDateTime.format(dTFormatterFULL));  nie można bo wymaga ZoneId
//        System.out.println("LONG: " + localDateTime.format(dTFormatterLONG));
        System.out.println("MEDIUM: " + localDateTime.format(dTFormatterMEDIUM));
        System.out.println("SHORT: " + localDateTime.format(dTFormatterSHORT));


        DateTimeFormatter zdTFormatterFULL = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        DateTimeFormatter zdTFormatterLONG = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter zdTFormatterMEDIUM = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter zdTFormatterSHORT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);


        System.out.println();
//        System.out.println("FULL: " + offsetDateTime.format(zdTFormatterFULL));
//        System.out.println("LONG: " + offsetDateTime.format(zdTFormatterLONG));
        System.out.println("MEDIUM: " + offsetDateTime.format(zdTFormatterMEDIUM));
        System.out.println("SHORT: " + offsetDateTime.format(zdTFormatterSHORT));


        System.out.println();
        System.out.println("FULL: " + zonedDateTime.format(zdTFormatterFULL));
        System.out.println("LONG: " + zonedDateTime.format(zdTFormatterLONG));
        System.out.println("MEDIUM: " + zonedDateTime.format(zdTFormatterMEDIUM));
        System.out.println("SHORT: " + zonedDateTime.format(zdTFormatterSHORT));

        DateTimeFormatter zdTFormatterFULL_GERMANY = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.GERMANY);
        DateTimeFormatter zdTFormatterLONG_GERMANY = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.GERMANY);
        DateTimeFormatter zdTFormatterMEDIUM_GERMANY = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.GERMANY);
        DateTimeFormatter zdTFormatterSHORT_GERMANY = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.GERMANY);

        System.out.println();
        System.out.println("FULL: " + zonedDateTime.format(zdTFormatterFULL_GERMANY));
        System.out.println("LONG: " + zonedDateTime.format(zdTFormatterLONG_GERMANY));
        System.out.println("MEDIUM: " + zonedDateTime.format(zdTFormatterMEDIUM_GERMANY));
        System.out.println("SHORT: " + zonedDateTime.format(zdTFormatterSHORT_GERMANY));
    }
}
