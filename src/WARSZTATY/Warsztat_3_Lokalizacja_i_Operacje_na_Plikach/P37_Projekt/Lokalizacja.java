package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

public class Lokalizacja {
    private final String country;
    private final String city;

    public Lokalizacja(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return " " + city +
                " w " + country;
    }
}
