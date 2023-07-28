package WARSZTATY.MOJE_PROGRAMY.Nauka_Angielskiego;

public enum KonstrukcjeGramatyczne {
    Zero_Conditional("warunek zerowy"),
    First_Conditional("warunek pierwszy"),
    Second_Conditional("warunek drugi"),
    Third_Conditional("warunek trzeci"),
    Reported_Speech("mowa zależna"),
    Passive_Voice("strona bierna"),
    Gerunds_and_Infinitives("czasowniki gerundialne i bezokolicznikowe"),
    Relative_Clauses("zdania względne"),
    Conditional_Sentences("zdania warunkowe"),
    Modal_Verbs("czasowniki modalne"),
    Phrasal_Verbs("czasowniki frazowe"),
    Question_Tags("tagi pytające"),
    Reported_Questions("pytania zależne"),
    Indirect_Questions("pytania pośrednie"),
    Direct_and_Indirect_Speech("mowa bezpośrednia i pośrednia"),
    Cleft_Sentences("zdania podmiotowe i orzecznikowe"),
    Inversion("inwersja"),
    Emphatic_Constructions("konstrukcje wyrażające nacisk"),
    Conditional_Clauses("zdania warunkowe"),
    Gerund_Clauses("zdania złożone z gerundium.");

    private String opis;
    KonstrukcjeGramatyczne(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }
}
