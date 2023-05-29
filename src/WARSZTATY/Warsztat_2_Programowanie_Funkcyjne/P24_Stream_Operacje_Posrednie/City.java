package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P24_Stream_Operacje_Posrednie;

public class City {
    private final String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String   toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
