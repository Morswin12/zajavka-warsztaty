package WARSZTATY.MOJE_PROGRAMY.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;


public class CzasFilmików {
    private int minuty;
    private int sekundy;
    private int nrFilmu;

    public CzasFilmików(int nrFilmu, int minuty, int sekundy) {
        this.nrFilmu = nrFilmu;
        this.minuty = minuty;
        this.sekundy = sekundy;
    }

    public int getMinuty() {
        return minuty;
    }

    public int getSekundy() {
        return sekundy;
    }

    public int getNrFilmu() {
        return nrFilmu;
    }

    public void setMinuty(int minuty) {
        this.minuty = minuty;
    }

    public void setSekundy(int sekundy) {
        this.sekundy = sekundy;
    }

    public void setNrFilmu(int nrFilmu) {
        this.nrFilmu = nrFilmu;
    }
}
