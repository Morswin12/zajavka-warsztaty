package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P14_P15_Java_16.Part2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainDateTime {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.parse("07:00:00");
        LocalTime time2 = LocalTime.parse("15:00:00");
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss B");// od Java 16 literka B
                                                                                        // pozwala na wydrukowanie
                                                                                        // adnotacji czy jest to
                                                                                        // przed, czy po południu
        System.out.println(dateTimeFormatter.format(time1));
        System.out.println(dateTimeFormatter.format(time2));
    }
}
