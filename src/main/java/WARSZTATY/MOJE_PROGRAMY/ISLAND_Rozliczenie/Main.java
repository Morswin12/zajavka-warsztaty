package WARSZTATY.MOJE_PROGRAMY.ISLAND_Rozliczenie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dniowka> mayHoures = new ArrayList<>();
        mayHoures.add(new Dniowka(1, 5, 2023, 0));
        mayHoures.add(new Dniowka(2, 5, 2023, 0));
        mayHoures.add(new Dniowka(3, 5, 2023, 0));
        mayHoures.add(new Dniowka(4, 5, 2023, 0));
        mayHoures.add(new Dniowka(5, 5, 2023, 0));
        mayHoures.add(new Dniowka(6, 5, 2023, 0));
        mayHoures.add(new Dniowka(7, 5, 2023, 0));
        mayHoures.add(new Dniowka(8, 5, 2023, 0));
        mayHoures.add(new Dniowka(9, 5, 2023, 0));
        mayHoures.add(new Dniowka(11, 5, 2023, 0));
        mayHoures.add(new Dniowka(12, 5, 2023, 0));
        mayHoures.add(new Dniowka(13, 5, 2023, 0));
        mayHoures.add(new Dniowka(14, 5, 2023, 0));
        mayHoures.add(new Dniowka(15, 5, 2023, 0));
        mayHoures.add(new Dniowka(16, 5, 2023, 0));
        mayHoures.add(new Dniowka(17, 5, 2023, 0));
        mayHoures.add(new Dniowka(18, 5, 2023, 0));
        mayHoures.add(new Dniowka(19, 5, 2023, 0));
        mayHoures.add(new Dniowka(20, 5, 2023, 0));
        mayHoures.add(new Dniowka(21, 5, 2023, 0));
        mayHoures.add(new Dniowka(22, 5, 2023, 0));
        mayHoures.add(new Dniowka(23, 5, 2023, 0));
        mayHoures.add(new Dniowka(24, 5, 2023, 0));
        mayHoures.add(new Dniowka(25, 5, 2023, 10));
        mayHoures.add(new Dniowka(26, 5, 2023, 10));
        mayHoures.add(new Dniowka(27, 5, 2023, 8));
        mayHoures.add(new Dniowka(28, 5, 2023, 0));
        mayHoures.add(new Dniowka(29, 5, 2023, 8));
        mayHoures.add(new Dniowka(30, 5, 2023, 10));
        mayHoures.add(new Dniowka(31, 5, 2023, 10));

        MonthsHours monthsHours = new MonthsHours(mayHoures);
        System.out.println("HoursOnMonth: " + monthsHours.getHoursOnMonth());
        System.out.println("NormalHours: " + monthsHours.getNormalHours());
        System.out.println("ExtraHours: " + monthsHours.getExtraHours());

    }

}
