package WARSZTATY.MOJ_NOTATNIK.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

public class Progress {
    private int wartosc_procentowa;
    public final int procent = 100;

    public Progress(int wartosc_procentowa) {
        this.wartosc_procentowa = wartosc_procentowa;
    }

    public int getProcent() {
        return wartosc_procentowa/procent;
    }
}
