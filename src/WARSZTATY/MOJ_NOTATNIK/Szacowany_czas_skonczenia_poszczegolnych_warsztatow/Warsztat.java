package WARSZTATY.MOJ_NOTATNIK.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

public class Warsztat {
    private String name;
    private int numer;
    private int iloscPostow;

    private CzasTrwania czasTrwania_FilmowKarola;

    private CzasTrwania czasTrwaniaPodsumowan;
    private CzasTrwania czasTrwania_RozwiazanZadan;
    private CzasTrwania sumarycznyCzas;
    private Progress procentPostepu;

    public Warsztat(String name,
                    int numer,
                    int iloscPostow,
                    CzasTrwania czasTrwania_FilmowKarola,
                    CzasTrwania czasTrwaniaPodsumowan,
                    CzasTrwania czasTrwania_RozwiazanZadan,
                    Progress procentPostepu) {
        this.name = name;
        this.numer = numer;
        this.iloscPostow = iloscPostow;
        this.czasTrwania_FilmowKarola = czasTrwania_FilmowKarola;
        this.czasTrwaniaPodsumowan = czasTrwaniaPodsumowan;
        this.czasTrwania_RozwiazanZadan = czasTrwania_RozwiazanZadan;
        this.procentPostepu = procentPostepu;
    }
}
