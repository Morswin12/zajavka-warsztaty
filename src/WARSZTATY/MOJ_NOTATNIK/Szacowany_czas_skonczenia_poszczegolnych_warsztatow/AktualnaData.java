package WARSZTATY.MOJ_NOTATNIK.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AktualnaData {

    Long minutes;
    Long houres;
    CzasTrwania godzinyIMinuty;
    Long dayOfStart;
    private LocalDate start = LocalDate.of(2023, 4, 12);
    private LocalDate end = LocalDate.of(2023, 9, 16);
    private LocalDate actualDate;

    public AktualnaData(Long dayOfStart) {
        this.dayOfStart = dayOfStart;
        this.actualDate = start.plusDays(dayOfStart);
        this.minutes = (long) (dayOfStart * 42);
        this.houres = minutes / 60;
        this.godzinyIMinuty = new CzasTrwania(houres, minutes % 60);
    }

    public AktualnaData(LocalDate actualDate) {
        this.actualDate = actualDate;
        this.dayOfStart = ChronoUnit.DAYS.between(start, actualDate);
        this.minutes = (long) (dayOfStart * 42);
        this.houres = minutes / 60;
        this.godzinyIMinuty = new CzasTrwania(houres, minutes % 60);
    }

    public AktualnaData(CzasTrwania godzinyIMinuty) {
        this.godzinyIMinuty = godzinyIMinuty;
        this.minutes = godzinyIMinuty.getMinuty() + godzinyIMinuty.getGodziny() * 60;
        this.dayOfStart = minutes/42;
        this.actualDate = start.plusDays(dayOfStart);
        this.houres = godzinyIMinuty.getGodziny();
    }


    public void printAmountOfMaterialsTime() {
        System.out.println("W dniu: " + actualDate + " powinno być przerobione: " + godzinyIMinuty);
        System.out.println("A w minutach jest to: " + minutes + " minut filmow");

    }
}
