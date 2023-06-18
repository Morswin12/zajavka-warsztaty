package WARSZTATY.MOJE_PROGRAMY.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RoboczaClacc {
    public static void main(String[] args) {
        LocalDate startCourse = LocalDate.of(2023, 4, 12);
        LocalDate endCourse = LocalDate.of(2023, 9, 16);
        long between = ChronoUnit.DAYS.between(startCourse, endCourse);
        System.out.println(between);
    }
}
