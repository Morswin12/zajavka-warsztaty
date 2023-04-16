package WARSZTATY.MOJ_NOTATNIK.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

public class CzasTrwania {

    private long godziny;
    private long minuty;

    public CzasTrwania(long godziny, long minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    public CzasTrwania(long godziny) {
        this.godziny = godziny;
        this.minuty = 0;
    }

    public long getGodziny() {
        return godziny;
    }

    public long getMinuty() {
        return minuty;
    }
}
