package WARSZTATY.MOJE_PROGRAMY.ISLAND_Rozliczenie;

import java.util.ArrayList;
import java.util.List;

public class MonthsHours {
    private final int hoursOnMonth;
    private final int normalHours;
    private final int extraHours;

    public MonthsHours(List<Dniowka> workHoursInMont) {
        this.hoursOnMonth = hoursOnMonthCalc(workHoursInMont);
        this.extraHours = extraHoursCalc(workHoursInMont).get(1);
        this.normalHours = extraHoursCalc(workHoursInMont).get(0);
    }

    private List<Integer> extraHoursCalc(List<Dniowka> workHoursInMont) {
        int extraHours1 = 0;
        int normalHours1 = 0;
        List<Integer> result = new ArrayList<>(2);
        for (Dniowka dniowka : workHoursInMont) {
            if (dniowka.getDate().getDayOfWeek().equals("SUNDAY")) {
                extraHours1 += dniowka.getHoursNumbers();
            }
            switch (dniowka.getDate().getDayOfWeek()) {
                case SUNDAY, SATURDAY -> extraHours1 += dniowka.getHoursNumbers();
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                    if (dniowka.getHoursNumbers() > 8) {
                        normalHours1 += 8;
                        extraHours1 += dniowka.getHoursNumbers() - 8;
                    } else {
                        normalHours1 += dniowka.getHoursNumbers();
                    }
                }
            }
        }

        result.add(0, normalHours1);
        result.add(0, extraHours1);
        return result;
    }

    private int normalHoursCalc(List<Dniowka> workHoursInMont) {
        return 0;
    }

    private int hoursOnMonthCalc(List<Dniowka> workHoursInMont) {
        int counter = 0;
        for (Dniowka dniowka : workHoursInMont) {
            counter += dniowka.getHoursNumbers();
        }
        return counter;
    }

    public int getHoursOnMonth() {
        return hoursOnMonth;
    }

    public int getNormalHours() {
        return normalHours;
    }

    public int getExtraHours() {
        return extraHours;
    }
}
