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

    public CzasTrwania add(CzasTrwania czasTrwania) {
        long godziny1 = czasTrwania.godziny;
        long minuty1 = czasTrwania.minuty;
        long godziny2 = this.godziny;
        long minuty2 = this.minuty;
        long extraGodziny = 0;

        long sumMinuty = minuty1 + minuty2;

        while (sumMinuty > 60) {
            extraGodziny++;
            sumMinuty = sumMinuty - 60;
        }
        long sumGodziny = godziny1 + godziny2 + extraGodziny;

        return new CzasTrwania(sumGodziny, sumMinuty);
    }

    @Override
    public String toString() {
        return "CzasTrwania{" +
                "godziny=" + godziny +
                ", minuty=" + minuty +
                '}';
    }
}

