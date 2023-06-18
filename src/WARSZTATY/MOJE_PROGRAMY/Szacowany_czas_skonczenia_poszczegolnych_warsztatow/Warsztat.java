package WARSZTATY.MOJE_PROGRAMY.Szacowany_czas_skonczenia_poszczegolnych_warsztatow;

public class Warsztat {
    private String name;
    private int numer;
    private int iloscPostow;

    private CzasTrwania czasTrwania_FilmowKarola;

    private CzasTrwania czasTrwaniaPodsumowan;
    private CzasTrwania czasTrwania_RozwiazanZadan;
    private CzasTrwania sumarycznyCzas = new CzasTrwania(0);
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
        this.sumarycznyCzas = sumarycznyCzas
                .add(czasTrwania_FilmowKarola)
//                .add(czasTrwaniaPodsumowan)
//                .add(czasTrwania_RozwiazanZadan)
        ;
    }

    public String getName() {
        return name;
    }

    public int getNumer() {
        return numer;
    }

    public int getIloscPostow() {
        return iloscPostow;
    }

    public CzasTrwania getCzasTrwania_FilmowKarola() {
        return czasTrwania_FilmowKarola;
    }

    public CzasTrwania getCzasTrwaniaPodsumowan() {
        return czasTrwaniaPodsumowan;
    }

    public CzasTrwania getCzasTrwania_RozwiazanZadan() {
        return czasTrwania_RozwiazanZadan;
    }

    public CzasTrwania getSumarycznyCzas() {
        return sumarycznyCzas;
    }

    public Progress getProcentPostepu() {
        return procentPostepu;
    }
}
