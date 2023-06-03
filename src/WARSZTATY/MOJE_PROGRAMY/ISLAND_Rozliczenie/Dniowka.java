package WARSZTATY.MOJE_PROGRAMY.ISLAND_Rozliczenie;

import java.time.LocalDate;

public class Dniowka {
    private final LocalDate date;
    private final int hoursNumbers;

    public Dniowka(int day, int month, int year, int hoursNumbers) {
        this.date = LocalDate.of(year, month, day);
        this.hoursNumbers = hoursNumbers;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHoursNumbers() {
        return hoursNumbers;
    }
}
